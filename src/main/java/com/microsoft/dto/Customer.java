package com.microsoft.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class Customer {


    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
