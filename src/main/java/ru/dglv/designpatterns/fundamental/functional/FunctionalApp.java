package ru.dglv.designpatterns.fundamental.functional;

public class FunctionalApp {
    public static void output() {
        System.out.println("[Secondary Thread]: Run via method reference");
    }

    public static void main(String[] args) {

        System.out.println("[Main Thread]: Started");
        Thread thread = new Thread(() -> System.out.println("[Secondary Thread]: Run via lambda"));
        thread.start();

        Thread thread2 = new Thread(FunctionalApp::output);
        thread2.start();

        System.out.println("[Main Thread]: Finished");
    }
}
