package model;

import interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream(){
        System.out.println("Creating a basic Ice-cream");
    }
    @Override
    public double cost() {
        return 30;
    }
}
