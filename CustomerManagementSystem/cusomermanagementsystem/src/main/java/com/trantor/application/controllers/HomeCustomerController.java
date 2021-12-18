package com.trantor.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/home")
public class HomeCustomerController {
	@RequestMapping(method = RequestMethod.GET)
	public String updateForm() {
		return "home.jsp";
	}

}
