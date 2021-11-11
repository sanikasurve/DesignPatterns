package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class MangoIceCream extends IceCreamDecorator {
    public MangoIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mango Ice-cream");
        return 65 + super.cost();
    }
}
