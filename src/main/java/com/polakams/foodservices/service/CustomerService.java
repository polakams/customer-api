package com.polakams.foodservices.service;

import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;

import java.util.List;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer getCustomerById(String id);

	void deleteCustomer(String id);

	Customer updateCustomer(String id, Customer customer);

	Customer patchCustomer(String id, Customer customer);

	List<Customer> getCustomersByLocality(String localityId);

	List<Order> getCustomerOrders(String id);
}
