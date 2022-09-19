package com.guptastore.gupta.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "SUPPLIER_TAB")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long supplierId;
	private String supplierName;
	private String supplierAddress;
	private long mobileNo;
	private String dealsIn;
	
	public Supplier(long supplierId, String supplierName, String supplierAddress, Long mobileNo, String dealsIn) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.mobileNo = mobileNo;
		this.dealsIn = dealsIn;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", mobileNo=" + mobileNo + ", dealsIn=" + dealsIn + "]";
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDealsIn() {
		return dealsIn;
	}
	public void setDealsIn(String dealsIn) {
		this.dealsIn = dealsIn;
	}
}
