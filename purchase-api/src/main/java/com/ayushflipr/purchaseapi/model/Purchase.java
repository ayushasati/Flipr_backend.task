package com.ayushflipr.purchaseapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "purchases")
public class Purchase {

    @Id
    private String purchaseOrderId;
    private String productName;
    private int quantity;
    private double pricing;
    private double mrp;
    private String customerId;

    // Constructors
    public Purchase() {
        // Default constructor
    }

    public Purchase(String purchaseOrderId, String productName, int quantity, double pricing, double mrp, String customerId) {
        this.purchaseOrderId = purchaseOrderId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricing = pricing;
        this.mrp = mrp;
        this.customerId = customerId;
    }

    // Getters and Setters
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // You can override the toString() method for better logging or debugging

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseOrderId='" + purchaseOrderId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", pricing=" + pricing +
                ", mrp=" + mrp +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
