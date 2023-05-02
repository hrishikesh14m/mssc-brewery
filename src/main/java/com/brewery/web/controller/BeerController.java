package com.brewery.web.controller;

import com.brewery.web.model.BeerDto;
import com.brewery.web.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {


    private final BeerService beerService;

    BeerController(BeerService beerService){
        this.beerService=beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerId(beerId), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
    BeerDto savedBeerDto= beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();

        //todo add hostname to url
        headers.add("Location","api/v1/beer/"+savedBeerDto.getId().toString());
        return  new ResponseEntity(headers,HttpStatus.CREATED);

    }

}
