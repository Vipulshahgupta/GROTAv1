package com.guptastore.gupta.services;

import java.util.List;

import com.guptastore.gupta.entities.Expense;

public interface ExpenseService {
	
	public List<Expense> getexpenseslist();

	public Expense addnewexpense(Expense expense);

}
