package com.ayushflipr.purchaseapi.service;


import com.ayushflipr.purchaseapi.model.Purchase;
import com.ayushflipr.purchaseapi.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase addPurchase(Purchase purchase) {
        // Additional validation or business logic can be added here
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    // Additional methods for fetching specific purchases or other operations
}
