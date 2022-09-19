package com.guptastore.gupta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guptastore.gupta.daorepo.SupplierPaymentDaoRepo;
import com.guptastore.gupta.entities.SupplierPayment;

@Service
public class SupplierPaymentServiceImpl implements SupplierPaymentService{
	
	
	@Autowired
	private SupplierPaymentDaoRepo supplierpaymentdaorepo;
	
	public SupplierPaymentServiceImpl() {
		
	}
	
	@Override
	public List<SupplierPayment> getsupplierspay(String name) {
		
		return supplierpaymentdaorepo.findBysupplierId(name);
	}

	@Override
	public SupplierPayment addsupplierspay(SupplierPayment supplierPayment) {
		supplierpaymentdaorepo.save(supplierPayment);
		return supplierPayment;
	}

	@Override
	public String updatesupplierspay(String supplier_name, Long supplier_bill_id, Double amount) 
	{
		SupplierPayment supplierPayment=supplierpaymentdaorepo.findBysupplierId(supplier_name, supplier_bill_id);
		double up_pendingamount = supplierPayment.getPendingAmount() - amount;
		System.out.println("The updated amount is "+ up_pendingamount + " fetched " + supplierPayment.getPendingAmount() + " passed amount " + amount);
		
		if(up_pendingamount > 0.0) {
			double tnx_id = supplierPayment.getTnxId()+amount;
			long supplier_id = supplierPayment.getSupplierId();
			String status="Unpaid";
			supplierpaymentdaorepo.updateSupplierPayment(tnx_id,amount,supplier_bill_id,status,up_pendingamount,supplier_id);
			return "The Bill Status - UnPaid - Transaction inserted";
		}
		else if(up_pendingamount == 0.0){
			double tnx_id = supplierPayment.getTnxId()+amount;
			long supplier_id = supplierPayment.getSupplierId();
			String status="Paid";
			supplierpaymentdaorepo.updateSupplierPayment(tnx_id,amount,supplier_bill_id,status,up_pendingamount,supplier_id);
			return "The Bill Status - Paid - Transaction inserted";}
		else {
			return "The Bill is already Cleared!!";
		}
		
	}

	
	
}
