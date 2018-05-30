package ru.dglv.designpatterns.fundamental.delegation;

class Developer {
    private Title title = new Junior();

    public void setTitle(final Title title) {
        this.title = title;
    }

    public void develop() {
        title.doWork();
    }
}
