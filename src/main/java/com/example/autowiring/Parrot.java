package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "miki";

    private Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }
    // should only create once
    public Parrot () {
        System.out.println("Parrot created");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
