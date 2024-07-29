package com.polakams.foodservices.service;

import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;
import com.polakams.foodservices.exception.CustomerAlreadyExistsException;
import com.polakams.foodservices.exception.NoSuchCustomerException;
import com.polakams.foodservices.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		if (customerRepository.findById(customer.getId()).isPresent()) {
			throw new CustomerAlreadyExistsException(customer.getId() + " already exists!");
		} else {
			return customerRepository.save(customer);
		}
	}

	@Override
	public Customer getCustomerById(String id) {
		Customer customerByCustomerId = customerRepository.findById(id).get();
		if (customerByCustomerId != null) {
			return customerByCustomerId;
		} else {
			throw new NoSuchCustomerException("Item not found with this customerId " + customerByCustomerId);
		}
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
