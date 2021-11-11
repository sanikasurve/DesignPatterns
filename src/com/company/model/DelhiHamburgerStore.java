package com.company.model;

import com.company.interfaces.HamburgerStore;

public class DelhiHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new DelhiCheeseBurger();
        } else if (type.equals("veggie")) {
            return new DelhiVeggieBurger();
        }
        else return null;
    }
}
