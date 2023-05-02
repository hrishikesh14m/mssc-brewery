package com.brewery.web.services;

import com.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerId(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
