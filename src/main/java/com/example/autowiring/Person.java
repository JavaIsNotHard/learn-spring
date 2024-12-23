package com.example.autowiring;

public class Person {

    private String name;
    private Parrot parort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParort() {
        return parort;
    }

    public void setParort(Parrot parort) {
        this.parort = parort;
    }
}
