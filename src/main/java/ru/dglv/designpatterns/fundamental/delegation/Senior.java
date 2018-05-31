package ru.dglv.designpatterns.fundamental.delegation;

public class Senior implements Position {
    public void doWork() {
        System.out.println("Senior reply: \"Ok, lets go ahead with it\"");
    }
}
