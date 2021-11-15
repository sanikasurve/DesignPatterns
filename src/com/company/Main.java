package com.company;

public class Main {

    public static void main(String[] args) {
	 Bank bank = new ProxyBank();

        try {
            bank.withdrawMoney("Sanika");
            bank.withdrawMoney("me@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
