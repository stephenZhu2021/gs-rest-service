package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.City;
import com.example.restservice.model.Owner;
import com.example.restservice.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetService {
    static List<Pet> pets = new ArrayList<>();

    public List<Pet> getAllPets(){
        pets.clear();
        Pet pet1 = new Pet(1,new Owner("ran",new Address(291,"avenue de deauville",
                new City("candiac","QC")),"5146598384"));
        Pet pet2 = new Pet(2,new Owner("qianqian",new Address(6550,"sherbrooke west",
                new City("montreal","QC")),"5146598384"));
        Pet pet3 = new Pet(3,new Owner("st",new Address(91,"rue de troy",
                new City("montreal","QC")),"5146598384"));

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        return pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }
}
