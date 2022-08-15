package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class CustomerRestController {
	@Autowired
	ICustomerService customerService;
	@GetMapping("/Customers")
	public List<Customer> customers(){
		
		return customerService.findAllCustomer();
	}

}
