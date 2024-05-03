package com.example.components;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    public Person() {
        this.name = "John";
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }
}
