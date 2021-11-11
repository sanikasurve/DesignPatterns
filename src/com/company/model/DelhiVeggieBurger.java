package com.company.model;

public class DelhiVeggieBurger extends Hamburger {

    public DelhiVeggieBurger(){
        name = "Delhi Style Veggie Burger";
        sauce = "Delhi Tadka";
        buns = "Pav buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Delhi style..");
    }
}
