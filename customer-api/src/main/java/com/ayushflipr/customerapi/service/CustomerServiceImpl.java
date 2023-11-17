package com.ayushflipr.customerapi.service;

import com.ayushflipr.customerapi.model.Customer;
import com.ayushflipr.customerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        // Implement logic to generate customer ID and save to the database
        // You can use UUID.randomUUID().toString() for simplicity
        customer.setCustomerId(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomersByCity(String city) {
        // Implement logic to fetch customers by city from the database
        return customerRepository.findByCity(city);
    }
    public List<Customer> getCustomersWithPurchaseAndShipmentDetails() {
        // Implement logic to fetch customers with purchase orders and shipments
        List<Customer> customers = customerRepository.findAll(); // You might want to customize this based on your data structure
        // Perform any additional logic to fetch related purchase orders and shipments

        return customers;
    }
}