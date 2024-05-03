package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Ingredient pasta = new Pasta();
        Chef chef = new Chef(pasta);
        chef.cookDish();
    }
}
