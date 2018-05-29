package ru.dglv.designpatterns.fundamental.interf;

public class ConsolePrintService implements PrintService
{
    public void print()
    {
        System.out.println("Console: print()");
    }

}
