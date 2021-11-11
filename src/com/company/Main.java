package com.company;

import com.company.interfaces.HamburgerStore;
import com.company.model.DelhiHamburgerStore;
import com.company.model.Hamburger;
import com.company.model.MumbaiHamburgerStore;

public class Main {

    public static void main(String[] args) {
        HamburgerStore delhiBurgerStore = new DelhiHamburgerStore();

        HamburgerStore mumbaiBurgerStore = new MumbaiHamburgerStore();

        Hamburger hamburger = delhiBurgerStore.orderHamburger("cheese");
        System.out.println("Sanika ordered " + hamburger.getName() + "\n");

        hamburger = mumbaiBurgerStore.orderHamburger("veggie");
        System.out.println("Samiksha ordered " + hamburger.getName() + "\n");

    }
}
