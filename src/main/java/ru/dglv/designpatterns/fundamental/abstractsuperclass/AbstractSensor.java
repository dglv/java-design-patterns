package ru.dglv.designpatterns.fundamental.abstractsuperclass;

abstract class AbstractSensor implements Sensor
{
    private byte[] buffer;

    protected abstract int getBufferSize();

    public void init()
    {
        final int size = getBufferSize();
        buffer = new byte[size];
        
        System.out.println("The buffer was initialized by init()");
    }

    public void input(byte[] bytes)
    {
        if (buffer == null)
        {
            throw new IllegalStateException("Internal buffer not initialized");
        }
        
        for (int i = 0; i < buffer.length; i++)
        {
            buffer[i] = bytes[i];
        }
    }

    public byte[] output()
    {
        if (buffer == null)
        {
            throw new IllegalStateException("Internal buffer not initialized");
        }
        
        return buffer.clone();
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public String asString()
    {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
