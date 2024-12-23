package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "miki";

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
