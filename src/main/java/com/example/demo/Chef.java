package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Chef {
    private Ingredient ingredient;

    public Chef(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void cookDish() {
        System.out.println("Chef is cooking a dish with " + ingredient.getName());
    }
}
