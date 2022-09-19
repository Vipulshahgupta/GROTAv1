package com.guptastore.gupta.services;

import java.util.List;

import com.guptastore.gupta.entities.CustomerPayment;

public interface CustomerPaymentService {

public List<CustomerPayment> getcustomerspay(String name);
	
	public CustomerPayment addcustomerspay(CustomerPayment customerPayment);
	
	public String updatecustomerspay(String customer_name, Long customer_bill_id, Double amount);
	
	
}
