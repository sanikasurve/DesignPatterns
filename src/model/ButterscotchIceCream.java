package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class ButterscotchIceCream extends IceCreamDecorator {
    public ButterscotchIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Butterscotch Ice-cream");
        return 40 + super.cost();
    }
}
