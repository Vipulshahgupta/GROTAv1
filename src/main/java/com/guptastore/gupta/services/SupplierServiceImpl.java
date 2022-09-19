package com.guptastore.gupta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guptastore.gupta.daorepo.SupplierDaoRepo;
import com.guptastore.gupta.entities.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierDaoRepo supplierdaorepo;
	
	public SupplierServiceImpl() {
		
	}
	
	@Override
	public List<Supplier> getsuppliers() {
		return supplierdaorepo.findAll();
	}

	@Override
	public Supplier addsuppliers(Supplier supplier) {
		
		supplierdaorepo.save(supplier);
		return supplier;
	}

	@Override
	public void deleteSuppliers(long supplierId) {
		Supplier en = supplierdaorepo.getOne(supplierId);
		supplierdaorepo.delete(en);
		
	}

	@Override
	public Supplier updateSuppliers(Supplier supplier) {
		supplierdaorepo.save(supplier);
		return supplier;
	}
	
	

}
