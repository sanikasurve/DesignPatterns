package com.company;

public class Singleton {

   // private static Singleton uniqueInstance = new Singleton();

    private volatile static Singleton uniqueInstance;
    String name;

    private Singleton(){

    }

    // double check locking
    public static Singleton getInstance(){
        if(uniqueInstance ==  null){
            synchronized ((Singleton.class)){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
