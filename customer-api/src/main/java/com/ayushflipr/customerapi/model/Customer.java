package com.ayushflipr.customerapi.model;

import com.ayushflipr.purchaseapi.model.Purchase;
import com.ayushflipr.shipmentapi.model.Shipment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    private String email;
    private String mobileNumber;
    private String city;
    private List<Purchase> purchaseOrders;
    private List<Shipment> shipments;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Purchase> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<Purchase> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

}