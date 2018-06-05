package ru.dglv.designpatterns.fundamental.immutableinterf;

public class ImmutableInterfApp {
    public static void main(String[] args) {
        ImmutablePerson person = new Person(1L, "Ivan", "Kuznetsov", "ivakuz@yopmail.com");

        //person.setId("42L"); // Not allowed!
        System.out.println("Person info: " + person.getFirstName() + ", " + person.getLastName());
    }
}
