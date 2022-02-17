package com.example.restservice.model;

public class Owner {
    private  String name;
    private  Address address;
    private String tel;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public Owner(String name, Address address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }
}
