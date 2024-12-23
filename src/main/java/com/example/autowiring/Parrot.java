package com.example.autowiring;

public class Parrot {

    private String name;

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
