package com.guptastore.gupta.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER_PAYMENT_TAB")
public class SupplierPayment {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long tnxId;
		private long billId;
		private long supplierId;
		private Date paymentDate;
		private double pendingAmount;
		private String paymentStatus;
		private double amountPaidToSupplier;
		
		
		
		@Override
		public String toString() {
			return "SupplierPayment [tnxId=" + tnxId + ", billId=" + billId + ", supplierId=" + supplierId
					+ ", paymentDate=" + paymentDate + ", pendingAmount=" + pendingAmount + ", paymentStatus="
					+ paymentStatus + ", amountPaidToSupplier=" + amountPaidToSupplier + "]";
		}
		public SupplierPayment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SupplierPayment(long tnxId, long billId, long supplierId, Date paymentDate, double pendingAmount,
				String paymentStatus, double amountPaidToSupplier) {
			super();
			this.tnxId = tnxId;
			this.billId = billId;
			this.supplierId = supplierId;
			this.paymentDate = paymentDate;
			this.pendingAmount = pendingAmount;
			this.paymentStatus = paymentStatus;
			this.amountPaidToSupplier = amountPaidToSupplier;
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
		public long getSupplierId() {
			return supplierId;
		}
		public void setSupplierId(long supplierId) {
			this.supplierId = supplierId;
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
		public double getAmountPaidToSupplier() {
			return amountPaidToSupplier;
		}
		public void setAmountPaidToSupplier(double amountPaidToSupplier) {
			this.amountPaidToSupplier = amountPaidToSupplier;
		}
}
