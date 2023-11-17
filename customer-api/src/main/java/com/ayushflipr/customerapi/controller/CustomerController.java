package com.ayushflipr.customerapi.controller;


import com.ayushflipr.customerapi.model.Customer;
import com.ayushflipr.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomersByCity(@RequestParam String city) {
        return customerService.getCustomersByCity(city);
    }
    public ResponseEntity<List<Customer>> getCustomersWithDetails() {
        List<Customer> customers = customerService.getCustomersWithPurchaseAndShipmentDetails();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}

