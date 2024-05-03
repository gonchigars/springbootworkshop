package com.example.demo;

public class Chef {
    private Ingredient ingredient;

    public Chef(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void cookDish() {
        System.out.println("Chef is cooking a dish with " + ingredient.getName());
    }
}