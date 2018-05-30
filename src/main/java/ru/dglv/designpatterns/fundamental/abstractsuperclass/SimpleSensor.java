package ru.dglv.designpatterns.fundamental.abstractsuperclass;

public class SimpleSensor extends AbstractSensor {
    private static final int BUFFER_SIZE = 8;

    @Override
    protected int getBufferSize() {
        return BUFFER_SIZE;
    }
}