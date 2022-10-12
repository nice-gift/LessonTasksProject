package by.kursy.luschik.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer) {
        thread = new Thread(this);
        this.text = text;
        this.printer = printer;
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        printer.print(text);
    }
}