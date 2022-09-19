package com.guptastore.gupta.daorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guptastore.gupta.entities.Supplier;


public interface SupplierDaoRepo extends JpaRepository<Supplier, Long>{

}
