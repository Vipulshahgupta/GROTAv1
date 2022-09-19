package com.guptastore.gupta.services;

import java.util.List;

import com.guptastore.gupta.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getcustomers();

	public Customer addcustomers(Customer customer);

	public void deleteCustomers(long customerId);

	public Customer updateCustomers(Customer customer);


}
