package com.backendassignment.backendassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendassignment.backendassignment.models.Customer;
import com.backendassignment.backendassignment.repositories.CustomerRepository;

import service.SequenceGeneratorService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository CustomerRepository;


	@PostMapping("/")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer)
	{
		Customer save = this.CustomerRepository.save(customer);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getCustomer()
	{
		
		return ResponseEntity.ok(this.CustomerRepository.findAll());
	}

}
