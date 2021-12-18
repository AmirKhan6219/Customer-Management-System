package com.trantor.application.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantor.application.dao.CustomerDAO;
import com.trantor.application.entity.CanadaState;
import com.trantor.application.entity.Country;
import com.trantor.application.entity.Customer;
import com.trantor.application.entity.IndiaState;
import com.trantor.application.entity.UsaState;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	

	public void addCustomer(Customer customer) {
		
		customerDAO.saveCustomer(customer);
	}

	public void updateCustomer(Customer customer) {
		
		customerDAO.updateCustomer(customer);
	}

	public void deleteCustomer(Customer customer) {
		
		customerDAO.deleteCustomer(customer);
	}

	public ArrayList<Customer> searchCustomerById(Integer id) {

		return customerDAO.searchCustomerById(id);
	}

	public ArrayList<Customer> searchCustomer() {

		return customerDAO.searchCustomer();

	}

	public Customer searchbycust(Integer id) {
		
		Customer entity = customerDAO.searchbycust(id);
		return entity;

	}

	public ArrayList<Country> getCountry() {
		
		return customerDAO.getCountry();

	}

	@Transactional
	public ArrayList<UsaState> getUsaStates() {
		return customerDAO.getUsaStates();

	}

	@Transactional
	public ArrayList<IndiaState> getIndiaStates() {
		
		return customerDAO.getIndiaStates();
	}

	@Transactional
	public ArrayList<CanadaState> getCanadaStates() {
		
		return customerDAO.getCanadaStates();
	}

}
