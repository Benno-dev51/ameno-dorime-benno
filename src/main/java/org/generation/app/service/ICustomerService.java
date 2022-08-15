package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;

public interface ICustomerService {
	public List<Customer> findAllCustomer();
	
public Customer saveCustomer(Customer customer);

public void deletCustomerById(Long id);
public Customer findCustomerById(Long id);
}
