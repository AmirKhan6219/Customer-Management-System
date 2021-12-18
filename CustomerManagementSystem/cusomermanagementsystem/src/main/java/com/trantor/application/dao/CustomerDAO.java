package com.trantor.application.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trantor.application.entity.CanadaState;
import com.trantor.application.entity.Country;
import com.trantor.application.entity.Customer;
import com.trantor.application.entity.IndiaState;
import com.trantor.application.entity.UsaState;
import com.trantor.application.repository.CanadaStateRepository;
import com.trantor.application.repository.CountryRepository;
import com.trantor.application.repository.CustomerRepository;
import com.trantor.application.repository.IndiaStateRepository;
import com.trantor.application.repository.UsaStateRepository;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private IndiaStateRepository indiaStateRepository;

	@Autowired
	private UsaStateRepository usaStateRepository;

	@Autowired
	private CanadaStateRepository canadaStateRepository;

	@Transactional
	public ArrayList<UsaState> getUsaStates() {

		return usaStateRepository.findAll();
	}

	@Transactional
	public ArrayList<IndiaState> getIndiaStates() {

		return indiaStateRepository.findAll();
	}

	@Transactional
	public ArrayList<CanadaState> getCanadaStates() {
		return canadaStateRepository.findAll();
	}


	@Transactional
	public void saveCustomer(Customer customer) {

		customerRepository.save(customer);
	}

	@Transactional
	public void deleteCustomer(Customer customer) {

		customerRepository.delete(customer);
	}

	@Transactional
	public ArrayList<Customer> searchCustomerById(Integer id) {

		return customerRepository.findByCustomerId(id);
	}

	@Transactional
	public Customer searchbycust(Integer id) {

		Customer entity = customerRepository.findByCustId(id);
		return entity;
	}

	@Transactional
	public ArrayList<Customer> searchCustomer() {

		return customerRepository.findAll();
	}

	@Transactional
	public void updateCustomer(Customer customer) {

		customerRepository.save(customer);
	}

	@Transactional
	public ArrayList<Country> getCountry() {

		ArrayList<Country> countryList = countryRepository.findAll();
		return countryList;
	}

}
