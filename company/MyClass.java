package com.company;

public class MyClass {

    //eagerly creating singleton class
    private static MyClass uniqueInstance = new MyClass();

    String name;
    private MyClass(){
    }

    public static MyClass getInstance(){
        //adding the synchronized keyword makes our singleton thread safe.
        /*if(uniqueInstance == null){
            uniqueInstance = new MyClass();
        }*/

        return new MyClass();
    }
}
