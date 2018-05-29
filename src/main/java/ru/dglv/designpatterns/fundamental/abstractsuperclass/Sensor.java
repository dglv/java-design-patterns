package ru.dglv.designpatterns.fundamental.abstractsuperclass;

public interface Sensor
{
    void init();
    
    void input(byte[] bytes);

    byte[] output();
    
    // Optional
    void clear();
    
    // Optional
    String asString();
}
