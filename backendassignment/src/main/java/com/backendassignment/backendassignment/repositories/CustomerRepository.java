package com.backendassignment.backendassignment.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backendassignment.backendassignment.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	

}
