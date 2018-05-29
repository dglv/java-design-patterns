package ru.dglv.designpatterns.fundamental.abstractsuperclass;

import java.util.Arrays;

public class App
{
    public static void main(final String[] args)
    {
        final byte[] inputStr = {'H', 'i', ' ', 't', 'h', 'e', 'r', 'e', ' ', '!'};

        // a simple sensor
        final Sensor simpleSensor = new SimpleSensor();
        simpleSensor.init();

        simpleSensor.input(inputStr);

        System.out.println("Output: " + Arrays.toString(simpleSensor.output()));

        try
        {
            simpleSensor.clear();
        }
        catch(final UnsupportedOperationException e)
        {
            System.out.println("Exception! " + e.getMessage());
        }

        // a smart sensor
        final Sensor smartSensor = new SmartSensor();
        smartSensor.init();

        smartSensor.input(inputStr);

        System.out.println("Output: " + Arrays.toString(smartSensor.output()));
        System.out.println("Output as String: " + smartSensor.asString());

        smartSensor.clear();

        System.out.println("Output: " + Arrays.toString(smartSensor.output()));
    }
}
