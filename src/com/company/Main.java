package com.company;

import interfaces.IceCream;
import model.BasicIceCream;
import model.ButterscotchIceCream;
import model.ChocolateIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost Rs "+ basicIceCream.cost());

        //add butterscotch to the order
        IceCream butterscotch = new ButterscotchIceCream(basicIceCream);
        System.out.println("Adding butterscotch - cost is Rs " + butterscotch.cost());

        //adding chocolate to the order
        IceCream chocolate = new ChocolateIceCream(butterscotch);
        System.out.println("Adding chocolate - cost is Rs " + chocolate.cost());

    }
}
