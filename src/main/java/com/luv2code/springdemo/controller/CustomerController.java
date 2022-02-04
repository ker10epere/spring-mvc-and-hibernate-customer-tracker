package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	
	@GetMapping("/list")
	public String getCustomerList(Model model) {
		List<Customer> customers = customerDAO.getCustomers();
		System.out.println("luv2code: " + customers);
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@ResponseBody
	@GetMapping("/listjson")
	public List<Customer> getCustomerListJson() {
		List<Customer> customers = customerDAO.getCustomers();
		System.out.println("luv2code Json: " + customers);
		return customers;
	}

}