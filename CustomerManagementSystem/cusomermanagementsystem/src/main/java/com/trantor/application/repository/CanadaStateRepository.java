package com.trantor.application.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.trantor.application.entity.CanadaState;

public interface CanadaStateRepository extends CrudRepository<CanadaState, Integer>{
	
	public ArrayList<CanadaState> findAll();

}
