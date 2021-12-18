package com.trantor.application.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.trantor.application.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{
	public ArrayList<Country> findAll();

}
