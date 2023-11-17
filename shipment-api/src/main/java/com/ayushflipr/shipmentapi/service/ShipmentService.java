package com.ayushflipr.shipmentapi.service;


import com.ayushflipr.shipmentapi.model.Shipment;
import com.ayushflipr.shipmentapi.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    // Add more service methods as needed

}
