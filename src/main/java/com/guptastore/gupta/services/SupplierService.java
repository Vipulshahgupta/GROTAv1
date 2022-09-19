package com.guptastore.gupta.services;

import java.util.List;


import com.guptastore.gupta.entities.Supplier;

public interface SupplierService {

	public List<Supplier> getsuppliers();

	public Supplier addsuppliers(Supplier supplier);

	public void deleteSuppliers(long supplierId);

	public Supplier updateSuppliers(Supplier supplier);

}
