package com.example.restservice.model;

public class Address {
    private int number;
    private String streetName;
    private City city;

    public int getNumber() {
        return number;
    }

    public String getStreetName() {
        return streetName;
    }

    public City getCity() {
        return city;
    }

    public Address(int number, String streetName, City city) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
    }
}
