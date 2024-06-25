package com.flipkart.business;

public class CustomerBusiness {

    public boolean registerCustomer(String firstName, String lastName, String email, String password) {
        System.out.println(firstName + " " + lastName + " " + email + " " + password);
        return true;
    }

    public boolean bookSlot()
    {
        return true;
    }

    public void viewHistory()
    {
        return;
    }

    public void cancelBooking()
    {
        return;
    }

    public void viewBookedSlots()
    {
        return;
    }

}