package com.trantor.application.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.application.entity.CanadaState;
import com.trantor.application.entity.Country;
import com.trantor.application.entity.Customer;
import com.trantor.application.entity.IndiaState;
import com.trantor.application.entity.UsaState;
import com.trantor.application.services.CustomerService;

@Controller
@RequestMapping(path = "/update")
public class UpdateCustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String updateForm(HttpServletRequest req) {
		ArrayList<Country> countryList = customerService.getCountry();


		ArrayList<IndiaState> indiaStates = customerService.getIndiaStates();

		ArrayList<CanadaState> canadaStates = customerService.getCanadaStates();

		ArrayList<UsaState> usaStates = customerService.getUsaStates();

		req.setAttribute("countryList", countryList);
		req.setAttribute("indiaList", indiaStates);
		req.setAttribute("canadaList", canadaStates);
		req.setAttribute("usaList", usaStates);
		return "updateform.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String updateDisplay(Customer customer, HttpServletRequest request) {
		customerService.updateCustomer(customer);
		request.setAttribute("customer", customer);
		return "updatedisplay.jsp";
	}

}
