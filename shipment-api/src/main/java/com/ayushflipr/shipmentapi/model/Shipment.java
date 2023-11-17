package com.ayushflipr.shipmentapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shipments")
public class Shipment {

    @Id
    private String id;
    private String address;
    private String city;
    private String pincode;
    private String purchaseOrderId;
    private String customerId;

    // Constructors

    public Shipment() {
        // Default constructor
    }

    public Shipment(String address, String city, String pincode, String purchaseOrderId, String customerId) {
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.purchaseOrderId = purchaseOrderId;
        this.customerId = customerId;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}