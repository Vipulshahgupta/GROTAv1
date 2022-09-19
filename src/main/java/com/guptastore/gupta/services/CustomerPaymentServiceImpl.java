package com.guptastore.gupta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guptastore.gupta.daorepo.CustomerPaymentDaoRepo;
import com.guptastore.gupta.entities.CustomerPayment;


@Service
public class CustomerPaymentServiceImpl implements CustomerPaymentService{
	
	@Autowired
	private CustomerPaymentDaoRepo customerpaymentdaorepo;
	
	public CustomerPaymentServiceImpl() {
		
	}
	
	@Override
	public List<CustomerPayment> getcustomerspay(String name) {
		
		return customerpaymentdaorepo.findBycustomerId(name);
	}

	@Override
	public CustomerPayment addcustomerspay(CustomerPayment customerPayment) {
		customerpaymentdaorepo.save(customerPayment);
		return customerPayment;
	}

	@Override
	public String updatecustomerspay(String customer_name, Long customer_bill_id, Double amount) 
	{
		
		CustomerPayment customerPayment=customerpaymentdaorepo.findBycustomerId(customer_name, customer_bill_id);
		double up_pendingamount = customerPayment.getPendingAmount() - amount;
		System.out.println("The updated amount is "+ up_pendingamount + " fetched " + customerPayment.getPendingAmount() + " passed amount " + amount);
		
		if(up_pendingamount > 0.0) {
			double tnx_id = customerPayment.getTnxId()+amount;
			long customer_id = customerPayment.getCustomerId();
			String status="Unpaid";
			customerpaymentdaorepo.updateCustomerPayment(tnx_id,amount,customer_bill_id,status,up_pendingamount,customer_id);
			return "The Bill Status - UnPaid - Transaction inserted";
		}
		else if(up_pendingamount == 0.0){
			double tnx_id = customerPayment.getTnxId()+amount;
			long customer_id = customerPayment.getCustomerId();
			String status="Paid";
			customerpaymentdaorepo.updateCustomerPayment(tnx_id,amount,customer_bill_id,status,up_pendingamount,customer_id);
			return "The Bill Status - Paid - Transaction inserted";}
		else {
			return "The Bill is already Cleared!!";
		}
		
	}

}
