package com.company;

public class Main {

    public static void main(String[] args) {

        //An example of a Java Library class that uses the Builder Design Patterns
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Hello World")
//                .append("I don't know")
//                .append("This is the end");

       // System.out.println(stringBuilder);

       User James = new User.UserBuilder("Ram", "Sharma")
               .phoneNumber("789")
               .build();

        //System.out.println(James);

        Person tallPerson = new Person.Builder("Ram", "Kumar ").build();

        System.out.println(tallPerson);


    }

}
