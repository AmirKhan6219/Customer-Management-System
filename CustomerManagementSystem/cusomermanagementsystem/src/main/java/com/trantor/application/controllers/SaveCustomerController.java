package com.trantor.application.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.application.entity.CanadaState;
import com.trantor.application.entity.Country;
import com.trantor.application.entity.Customer;
import com.trantor.application.entity.IndiaState;
import com.trantor.application.entity.UsaState;
import com.trantor.application.services.CustomerService;

@Controller
@RequestMapping(path = "/save")
public class SaveCustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String saveForm(Customer customer, Model model) {

		ArrayList<Country> countryList = customerService.getCountry();

		ArrayList<IndiaState> indiaStates = customerService.getIndiaStates();

		ArrayList<CanadaState> canadaStates = customerService.getCanadaStates();

		ArrayList<UsaState> usaStates = customerService.getUsaStates();

		model.addAttribute("countryList", countryList);
		model.addAttribute("indiaList", indiaStates);
		model.addAttribute("canadaList", canadaStates);
		model.addAttribute("usaList", usaStates);

		return "saveform.jsp";

	}

//	@RequestMapping(method = RequestMethod.GET)
//	public String saveForm(CustomerEntity customer, HttpServletRequest req) {
//
//		ArrayList<CountryEntity> countryList = customerServices.getCountry();
//
//
//		ArrayList<IndiaStateEntity> indiaStates = customerServices.getIndiaStates();
//
//		ArrayList<AustraliaStateEntity> australiaStates = customerServices.getAustraliaStates();
//
//		ArrayList<CanadaStateEntity> canadaStates = customerServices.getCanadaStates();
//
//		ArrayList<UsaStateEntity> usaStates = customerServices.getUsaStates();
//
//		req.setAttribute("countryList", countryList);
//		req.setAttribute("indiaList", indiaStates);
//		req.setAttribute("australiaList", australiaStates);
//		req.setAttribute("canadaList", canadaStates);
//		req.setAttribute("usaList", usaStates);
//
//		return "addcustomer.jsp";
//
//	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveDisplay(Customer customer, Model model) {
		//System.out.println(customer.getCustomerNo());
		model.addAttribute("customer", customer);
		customerService.addCustomer(customer);

		return "savedisplay.jsp";

	}

}
