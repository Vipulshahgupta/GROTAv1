package com.guptastore.gupta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guptastore.gupta.daorepo.ExpenseDaoRepo;
import com.guptastore.gupta.entities.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	private ExpenseDaoRepo expensedaorepo;
	
	public ExpenseServiceImpl() {
		
	}
	

	@Override
	public List<Expense> getexpenseslist() {
		return expensedaorepo.findAll();
	}

	@Override
	public Expense addnewexpense(Expense expense) {
		expensedaorepo.save(expense);
		return expense;
	}

}
