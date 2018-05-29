package ru.dglv.designpatterns.fundamental.delegation;

public class Middle implements Title
{
    public void doWork()
    {
        System.out.println("Middle reply: \"I don`t have enough expirience to do this work in time\"");
    }
}
