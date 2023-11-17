package com.ayushflipr.shipmentapi.repository;

import com.ayushflipr.shipmentapi.model.Shipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {

    // Custom queries can be added here if needed

}