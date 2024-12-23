package com.example.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("miki");
        return parrot;
    }

    @Bean
    // performing dependency injection
    public Person person(Parrot parrot) {
        Person person = new Person();
        person.setName("Jibesh");
        person.setParrot(parrot);
        return person;
    }

}
