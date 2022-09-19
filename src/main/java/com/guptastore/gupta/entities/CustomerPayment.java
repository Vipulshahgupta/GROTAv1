package com.guptastore.gupta.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_PAYMENT_TAB")
public class CustomerPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tnxId;
	private long billId;
	private long customerId;
	private Date paymentDate;
	private double pendingAmount;
	private String paymentStatus;
	private double amountPaidToCustomer;
	

	@Override
	public String toString() {
		return "CustomerPayment [tnxId=" + tnxId + ", billId=" + billId + ", customerId=" + customerId
				+ ", paymentDate=" + paymentDate + ", pendingAmount=" + pendingAmount + ", paymentStatus="
				+ paymentStatus + ", amountPaidToCustomer=" + amountPaidToCustomer + "]";
	}
	
	public CustomerPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerPayment(long tnxId, long billId, long customerId, Date paymentDate, double pendingAmount,
			String paymentStatus, double amountPaidToCustomer) {
		super();
		this.tnxId = tnxId;
		this.billId = billId;
		this.customerId = customerId;
		this.paymentDate = paymentDate;
		this.pendingAmount = pendingAmount;
		this.paymentStatus = paymentStatus;
		this.amountPaidToCustomer = amountPaidToCustomer;
	}
	
	public long getTnxId() {
		return tnxId;
	}
	public void setTnxId(long tnxId) {
		this.tnxId = tnxId;
	}
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public double getAmountPaidToCustomer() {
		return amountPaidToCustomer;
	}
	public void setAmountPaidToCustomer(double amountPaidToCustomer) {
		this.amountPaidToCustomer = amountPaidToCustomer;
	}

}
