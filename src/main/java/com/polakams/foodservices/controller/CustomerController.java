package com.polakams.foodservices.controller;

import com.polakams.foodServices.api.CustomerApi;
import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;
import com.polakams.foodservices.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class CustomerController implements CustomerApi {

	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public ResponseEntity<Customer> createCustomer(Customer customer) {
		Customer createdCustomer = customerService.createCustomer(customer);
		return ResponseEntity.status(201).body(createdCustomer);
	}

	@Override
	public ResponseEntity<Customer> getCustomerById(UUID id) {
		Customer customer = customerService.getCustomerById(id.toString());
		return ResponseEntity.ok(customer);
	}

	@Override
	public ResponseEntity<Void> deleteCustomer(UUID id) {
		customerService.deleteCustomer(id.toString());
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Customer> updateCustomer(UUID id, Customer customer) {
		Customer updatedCustomer = customerService.updateCustomer(id.toString(), customer);
		return ResponseEntity.ok(updatedCustomer);
	}

	@Override
	public ResponseEntity<Customer> patchCustomer(UUID id, Customer customer) {
		Customer patchedCustomer = customerService.patchCustomer(id.toString(), customer);
		return ResponseEntity.ok(patchedCustomer);
	}

	@Override
	public ResponseEntity<List<Customer>> getCustomersByLocality(UUID localityId) {
		List<Customer> customers = customerService.getCustomersByLocality(localityId.toString());
		return ResponseEntity.ok(customers);
	}

	@Override
	public ResponseEntity<List<Order>> getCustomerOrders(UUID id) {
		List<Order> orders = customerService.getCustomerOrders(id.toString());
		return ResponseEntity.ok(orders);
	}
}
