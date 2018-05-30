package ru.dglv.designpatterns.fundamental.abstractsuperclass;

abstract class AbstractSensor implements Sensor {
    private byte[] buffer;

    public void input(byte[] bytes) {
        if (buffer == null) {
            init();
        }

        System.arraycopy(bytes, 0, buffer, 0, buffer.length);
    }

    public byte[] output() {
        if (buffer == null) {
            init();
        }

        return buffer.clone();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public String asString() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    protected abstract int getBufferSize();

    protected void init() {
        buffer = new byte[getBufferSize()];

        System.out.println("The buffer was initialized successfully.");
    }
}
