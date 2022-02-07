package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/list")
	public String getCustomerList(Model model) {
		List<Customer> customers = customerService.getCustomers();
		System.out.println("luv2code: " + customers);
		model.addAttribute("customers", customers);
		return "list-customers";
	}

	@ResponseBody
	@GetMapping("/listjson")
	public List<Customer> getCustomerListJson() {
		List<Customer> customers = customerService.getCustomers();
		System.out.println("luv2code Json: " + customers);
		return customers;
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println("Code2Luv: " + customer);
		return "redirect:/customer/list";
	}

}
