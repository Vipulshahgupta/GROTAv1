package com.guptastore.gupta.daorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guptastore.gupta.entities.Expense;


public interface ExpenseDaoRepo extends JpaRepository<Expense, Long>  {

}
