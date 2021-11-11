package com.company.model;

public class MumbaiCheeseBurger extends Hamburger {

    public MumbaiCheeseBurger(){
        name = "Mumbai Style Cheese Burger";
        sauce = "Mumbai masala";
        buns = "Pav buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Mumbai style..");
    }
}
