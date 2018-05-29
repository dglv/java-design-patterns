package ru.dglv.designpatterns.fundamental.delegation;

public class App
{
    public static void main(final String[] args)
    {
        final Developer developer = new Developer();
        developer.develop();
        
        developer.setTitle(new Middle());
        developer.develop();
        
        developer.setTitle(new Senior());
        developer.develop();
    }
}
