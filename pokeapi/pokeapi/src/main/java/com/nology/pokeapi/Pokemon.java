package com.nology.pokeapi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Tell spring that this is a class we want to save in our external database
public class Pokemon {

    @Id
    int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pokemon(String name) {
        this.name = name;
    }

    public Pokemon() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
