package com.guptastore.gupta.services;

import java.util.List;

import com.guptastore.gupta.entities.SupplierPayment;

public interface SupplierPaymentService {
	
	public List<SupplierPayment> getsupplierspay(String name);
	
	public SupplierPayment addsupplierspay(SupplierPayment supplierPayment);
	
	public String updatesupplierspay(String supplier_name, Long supplier_bill_id, Double amount);
	

}
