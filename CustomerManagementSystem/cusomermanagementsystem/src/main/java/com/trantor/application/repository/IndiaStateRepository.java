package com.trantor.application.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.trantor.application.entity.IndiaState;

public interface IndiaStateRepository extends CrudRepository<IndiaState, Integer>{
	
	public ArrayList<IndiaState> findAll();


}
