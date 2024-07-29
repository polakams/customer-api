package com.polakams.foodservices.controller;

import com.polakams.foodServices.api.CustomerApiDelegate;
import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;
import com.polakams.foodservices.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerController implements CustomerApiDelegate {

	@Autowired
	private CustomerService customerService;

	@Override
	public ResponseEntity<Customer> createCustomer(Customer customer) {
		Customer createdCustomer = customerService.createCustomer(customer);
		return new ResponseEntity<>(createdCustomer, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Customer> getCustomerById(String id) {
		Customer customer = customerService.getCustomerById(id.toString());
		return ResponseEntity.ok(customer);
	}

	@Override
	public ResponseEntity<Void> deleteCustomer(String id) {
		customerService.deleteCustomer(id.toString());
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Customer> updateCustomer(String id, Customer customer) {
		Customer updatedCustomer = customerService.updateCustomer(id.toString(), customer);
		return ResponseEntity.ok(updatedCustomer);
	}

	@Override
	public ResponseEntity<Customer> patchCustomer(String id, Customer customer) {
		Customer patchedCustomer = customerService.patchCustomer(id.toString(), customer);
		return ResponseEntity.ok(patchedCustomer);
	}

	@Override
	public ResponseEntity<List<Customer>> getCustomersByLocality(String localityId) {
		List<Customer> customers = customerService.getCustomersByLocality(localityId.toString());
		return ResponseEntity.ok(customers);
	}

	@Override
	public ResponseEntity<List<Order>> getCustomerOrders(String id) {
		List<Order> orders = customerService.getCustomerOrders(id.toString());
		return ResponseEntity.ok(orders);
	}
}
