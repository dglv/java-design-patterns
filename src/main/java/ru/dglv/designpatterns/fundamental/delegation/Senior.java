package ru.dglv.designpatterns.fundamental.delegation;

public class Senior implements Title
{
    public void doWork()
    {
        System.out.println("Senior reply: \"Ok, lets go ahead with it\"");
    }
}
