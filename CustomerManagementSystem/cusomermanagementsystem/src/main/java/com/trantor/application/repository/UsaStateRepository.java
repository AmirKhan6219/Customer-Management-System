package com.trantor.application.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.trantor.application.entity.UsaState;

public interface UsaStateRepository extends CrudRepository<UsaState, Integer> {

	public ArrayList<UsaState> findAll();

}
