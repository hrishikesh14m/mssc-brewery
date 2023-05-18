package com.brewery.web.services;

import com.brewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.ResponseStatus;


import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Hrishikesh").build();
    }

    @Override
    public CustomerDto postCustomer(UUID id, CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Hrishi").build();
    }

    @Override
<<<<<<< Updated upstream
    @ResponseStatus
=======
    @ResponseStatus(HttpStatus.NO_CONTENT)
>>>>>>> Stashed changes
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        //todo implementation
    }

    @Override
<<<<<<< Updated upstream
=======
    @ResponseStatus(HttpStatus.NO_CONTENT)
>>>>>>> Stashed changes
    public void deleteCustomer(UUID id) {
        //todo implementation
    }

}
