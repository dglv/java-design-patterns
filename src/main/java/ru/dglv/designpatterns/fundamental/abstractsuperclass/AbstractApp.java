package ru.dglv.designpatterns.fundamental.abstractsuperclass;

import java.util.Arrays;

class AbstractApp {
    public static void main(String[] args) {
        byte[] inputStr = {'H', 'i', ' ', 't', 'h', 'e', 'r', 'e', ' ', '!'};

        // a simple sensor
        Sensor simpleSensor = new SimpleSensor();
        simpleSensor.input(inputStr);
        System.out.println("Output: " + Arrays.toString(simpleSensor.output()));

        try {
            simpleSensor.clear();
        } catch (final UnsupportedOperationException e) {
            System.out.println("Exception! " + e.getMessage());
        }

        // a smart sensor
        Sensor smartSensor = new SmartSensor();
        smartSensor.input(inputStr);

        System.out.println("Output: " + Arrays.toString(smartSensor.output()));
        System.out.println("Output as String: " + smartSensor.asString());

        smartSensor.clear();

        System.out.println("Output: " + Arrays.toString(smartSensor.output()));
    }
}
