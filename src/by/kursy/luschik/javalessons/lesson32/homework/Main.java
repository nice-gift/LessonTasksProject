package by.kursy.luschik.javalessons.lesson32.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WriterThread writerThread1 = new WriterThread("Writer Thread1");
        Thread thread1 = new Thread(writerThread1);
        thread1.start();

        WriterThread writerThread2 = new WriterThread("Writer Thread2");
        Thread thread2 = new Thread(writerThread2);

        try {
            thread1.join();
            thread2.start();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        String text = "Main thread";

        Printer.print(text);
    }
}