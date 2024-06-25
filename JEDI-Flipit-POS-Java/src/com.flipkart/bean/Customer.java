package com.flipkart.bean;

public class Customer extends User {
    private String customerAddress;
    private String customerCardNumber;

    public Customer (String customerAddress, String customerCardNumber) {
        this.customerAddress = customerAddress;
        this.customerCardNumber = customerCardNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber = customerCardNumber;
    }
}