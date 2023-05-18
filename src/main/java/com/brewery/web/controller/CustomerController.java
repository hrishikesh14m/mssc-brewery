package com.brewery.web.controller;

import com.brewery.web.model.CustomerDto;
import com.brewery.web.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID id){

        return new ResponseEntity<CustomerDto>(customerService.getCustomer(id), HttpStatus.OK);
    }

    @PostMapping("/{customerId}")
    public ResponseEntity handlePost(@PathVariable("customerId")UUID id ,
                                     @RequestBody CustomerDto customerDto){

       CustomerDto customerDto1= customerService.postCustomer(id,customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","api/v1/customer"+customerDto1.getId().toString());

        return new ResponseEntity(headers , HttpStatus.OK);
    }


    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handlePut(@PathVariable("customerId") UUID id,
                          @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(id,customerDto);
    }


    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID id){
        customerService.deleteCustomer(id);

    }

}

