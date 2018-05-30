package ru.dglv.designpatterns.fundamental.abstractsuperclass;

interface Sensor {
    void input(byte[] bytes);

    byte[] output();

    // Optional
    void clear();

    // Optional
    String asString();
}
