package com.example.context;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
