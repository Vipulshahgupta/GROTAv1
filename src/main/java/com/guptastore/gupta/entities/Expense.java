package com.guptastore.gupta.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EXPENDITURE_TAB")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long expenseTnxId;
	private String expenseDesc;
	private Date expenseDate;
	private String expenseMode;
	private double expenseAmount;
	
	@Override
	public String toString() {
		return "Expense [expenseTnxId=" + expenseTnxId + ", expenseDesc=" + expenseDesc + ", expenseDate=" + expenseDate
				+ ", expenseMode=" + expenseMode + ", expenseAmount=" + expenseAmount + "]";
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Expense(long expenseTnxId, String expenseDesc, Date expenseDate, String expenseMode, double expenseAmount) {
		super();
		this.expenseTnxId = expenseTnxId;
		this.expenseDesc = expenseDesc;
		this.expenseDate = expenseDate;
		this.expenseMode = expenseMode;
		this.expenseAmount = expenseAmount;
	}
	public long getExpenseTnxId() {
		return expenseTnxId;
	}
	public void setExpenseTnxId(long expenseTnxId) {
		this.expenseTnxId = expenseTnxId;
	}
	public String getExpenseDesc() {
		return expenseDesc;
	}
	public void setExpenseDesc(String expenseDesc) {
		this.expenseDesc = expenseDesc;
	}
	public Date getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getExpenseMode() {
		return expenseMode;
	}
	public void setExpenseMode(String expenseMode) {
		this.expenseMode = expenseMode;
	}
	public double getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	
	
	
}




		