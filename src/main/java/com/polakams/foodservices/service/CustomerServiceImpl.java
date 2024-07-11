package com.polakams.foodservices.service;

import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;
import com.polakams.foodservices.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO: Implement business logic for creating a customer
		return customer;
	}

	@Override
	public Customer getCustomerById(String id) {
		// TODO: Implement business logic for retrieving a customer by ID
		Customer cus = new Customer();
		cus.id(id);
		cus.name("test");
		return cus;
	}

	@Override
	public void deleteCustomer(String id) {
		// TODO: Implement business logic for deleting a customer
	}

	@Override
	public Customer updateCustomer(String id, Customer customer) {
		// TODO: Implement business logic for updating a customer
		return customer;
	}

	@Override
	public Customer patchCustomer(String id, Customer customer) {
		// TODO: Implement business logic for partially updating a customer
		return customer;
	}

	@Override
	public List<Customer> getCustomersByLocality(String localityId) {
		// TODO: Implement business logic for retrieving customers by locality
		return List.of();
	}

	@Override
	public List<Order> getCustomerOrders(String id) {
		// TODO: Implement business logic for retrieving orders for a customer
		return List.of();
	}
}
