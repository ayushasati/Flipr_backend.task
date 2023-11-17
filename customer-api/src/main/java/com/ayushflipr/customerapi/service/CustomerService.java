package com.ayushflipr.customerapi.service;

import com.ayushflipr.customerapi.model.Customer;

import java.util.*;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getCustomersByCity(String city);

    List<Customer> getCustomersWithPurchaseAndShipmentDetails();
}