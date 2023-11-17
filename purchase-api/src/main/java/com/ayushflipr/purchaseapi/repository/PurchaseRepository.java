package com.ayushflipr.purchaseapi.repository;

import com.ayushflipr.purchaseapi.model.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {

    // Additional query methods if needed
}