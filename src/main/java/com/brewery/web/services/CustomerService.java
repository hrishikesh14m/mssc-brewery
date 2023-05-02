package com.brewery.web.services;

import com.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomer(UUID id);

    CustomerDto postCustomer(UUID id, CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);

}
