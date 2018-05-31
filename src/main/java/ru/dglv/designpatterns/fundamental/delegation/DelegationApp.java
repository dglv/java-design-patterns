package ru.dglv.designpatterns.fundamental.delegation;

class DelegationApp {
    public static void main(final String[] args) {
        final Developer developer = new Developer(new Junior());
        developer.develop();

        developer.setPosition(new Middle());
        developer.develop();

        developer.setPosition(new Senior());
        developer.develop();
    }
}
