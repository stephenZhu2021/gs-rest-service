package com.example.restservice.model;

public class Pet {
    private int id;
    private Owner owner;

    public Pet() {
    }

    public Pet(int id, Owner owner) {
        this.id = id;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", owner=" + owner +
                '}';
    }
}
