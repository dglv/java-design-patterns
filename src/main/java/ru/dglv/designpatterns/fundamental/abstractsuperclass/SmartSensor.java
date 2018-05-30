package ru.dglv.designpatterns.fundamental.abstractsuperclass;

public class SmartSensor extends AbstractSensor {
    private static final int BUFFER_SIZE = 8;

    @Override
    protected int getBufferSize() {
        return BUFFER_SIZE;
    }

    @Override
    public void clear() {
        init();
    }

    @Override
    public String asString() {
        return new String(output());
    }
}
