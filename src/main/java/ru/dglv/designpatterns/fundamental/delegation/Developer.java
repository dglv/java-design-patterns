package ru.dglv.designpatterns.fundamental.delegation;

import javafx.geometry.Pos;

class Developer {
    private Position position;

    public Developer(Position position) {
        this.position = position;
    }

    public void setPosition(final Position position) {
        this.position = position;
    }

    public void develop() {
        position.doWork();
    }
}
