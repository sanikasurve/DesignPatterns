package com.company.model;

import com.company.interfaces.HamburgerStore;

public class MumbaiHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new MumbaiCheeseBurger();
        } else if (type.equals("veggie")) {
            return new MumbaiVeggieBurger();
        }
        else return null;
    }
}
