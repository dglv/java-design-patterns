package ru.dglv.designpatterns.fundamental.interf;

class InterfApp {
    public static void main(final String[] args) {
        PrintService printerService = new ConsolePrintService();
        printerService.print();

        printerService = new FilePrintService();
        printerService.print();
    }
}
