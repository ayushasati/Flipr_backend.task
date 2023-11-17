package com.ayushflipr.customerapi.repository;

import com.ayushflipr.customerapi.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByCity(String city);
    Optional<Customer> findByCustomerId(String customerId);
}
