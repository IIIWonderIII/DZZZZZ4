package com.company.second;

public class Contact {

    private String phoneNumber;
    private String lastName;

    public Contact() {
    }

    public Contact(String phoneNumber, String lastName) {
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
