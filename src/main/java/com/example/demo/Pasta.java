package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Pasta implements Ingredient {
    public String getName() {
        return "Pasta";
    }
}
