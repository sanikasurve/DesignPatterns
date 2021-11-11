package com.company.model;

public class MumbaiVeggieBurger extends Hamburger {

    public MumbaiVeggieBurger(){
        name = "Mumbai Style Veggie Burger";
        sauce = "Mumbai masala";
        buns = "Pav buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Mumbai style..");
    }
}
