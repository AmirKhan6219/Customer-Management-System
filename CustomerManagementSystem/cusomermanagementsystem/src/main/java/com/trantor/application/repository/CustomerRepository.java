package com.trantor.application.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trantor.application.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	public ArrayList<Customer> findAll();
	
	@Query(value = "select * from customer_tbl  where customer_id = ?", nativeQuery = true)
	ArrayList<Customer> findByCustomerId(@Param("no") Integer no);
	
	@Query(value = "select * from customer_tbl  where customer_id = ?", nativeQuery = true)
	Customer findByCustId(@Param("no") Integer no);
	
	

}
