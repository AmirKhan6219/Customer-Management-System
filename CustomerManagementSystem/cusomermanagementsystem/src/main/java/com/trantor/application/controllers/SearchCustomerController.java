package com.trantor.application.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.application.entity.Customer;
import com.trantor.application.services.CustomerService;

@Controller

public class SearchCustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String searchForm() {
		return "searchform.jsp";
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String searchDisplay(Customer customer , Model model) {
		
		ArrayList<Customer> arrayList = customerService.searchCustomerById(customer.getCustomerId());
		model.addAttribute("customerList", arrayList);
		
		return "searchdisplay.jsp";
	}

	@RequestMapping(path = "/searchall", method = RequestMethod.POST)
	public String searchallDisplay(Customer customer, HttpServletRequest request) {
		ArrayList<Customer> arrayList = customerService.searchCustomer();
		request.setAttribute("customerList", arrayList);
		return "searchalldisplay.jsp";
	}

}
