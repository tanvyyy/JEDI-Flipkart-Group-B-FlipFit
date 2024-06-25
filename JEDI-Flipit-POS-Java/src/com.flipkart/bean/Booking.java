package com.flipkart.bean;

public class Booking {
    private String bookingId;
    private String userID;

    public Booking (String bookingId, String userID) {
        this.bookingId = bookingId;
        this.userID = userID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }


}