package ru.dglv.designpatterns.fundamental.delegation;

public class Middle implements Position {
    public void doWork() {
        System.out.println("Middle reply: \"I don`t have enough experience to do this work in time\"");
    }
}
