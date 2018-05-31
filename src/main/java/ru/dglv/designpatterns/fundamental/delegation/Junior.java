package ru.dglv.designpatterns.fundamental.delegation;

public class Junior implements Position {
    public void doWork() {
        System.out.println("Junior reply: \"It is too hard for me!\"");
    }
}
