package com.guptastore.gupta.daorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guptastore.gupta.entities.Customer;

public interface CustomerDaoRepo extends JpaRepository<Customer, Long>{

}
