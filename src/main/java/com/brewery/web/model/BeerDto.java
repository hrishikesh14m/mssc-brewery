package com.brewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder   //builder pattern produces complex builder pattern for your code.
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;



}
