package com.trantor.application.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.application.entity.Customer;
import com.trantor.application.services.CustomerService;

@Controller
@RequestMapping(path = "/delete")
public class DeleteCustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String deleteForm(Customer customer) {

		return "deleteform.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String deleteDisplay(Customer customer, HttpServletRequest req) {
		
//		CustomerEntity entity = customerServices.searchbycust(customer.getCustomerId());
//		model.addAttribute("customerList", entity);
//		if (customer.getCustomerId() != 0 && customer.getCustomerId() != 0) {
//		}
		
		customerService.deleteCustomer(customer);
		req.setAttribute("customer", customer);


		return "deletedisplay.jsp";
	}

}
