package com.guptastore.gupta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guptastore.gupta.daorepo.CustomerDaoRepo;
import com.guptastore.gupta.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDaoRepo customerdaorepo;
	
	public CustomerServiceImpl() {
		
	}

	@Override
	public List<Customer> getcustomers() {
		return customerdaorepo.findAll();
	}

	@Override
	public Customer addcustomers(Customer customer) {
		customerdaorepo.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomers(long customerId) {
		Customer en = customerdaorepo.getOne(customerId);
		customerdaorepo.delete(en);
		
	}

	@Override
	public Customer updateCustomers(Customer customer) {
		customerdaorepo.save(customer);
		return customer;
	}
	
	

}
