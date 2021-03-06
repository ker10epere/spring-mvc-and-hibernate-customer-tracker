package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(Integer id);

	void deleteCustomer(Integer id);

	void deleteCustomerHQL(Integer id);
}
