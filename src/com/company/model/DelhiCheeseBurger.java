package com.company.model;

public class DelhiCheeseBurger extends Hamburger {

    public DelhiCheeseBurger(){
        name = "Delhi Style Cheese Burger";
        sauce = "Delhi Tadka";
        buns = "Pav buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Delhi style..");
    }
}
