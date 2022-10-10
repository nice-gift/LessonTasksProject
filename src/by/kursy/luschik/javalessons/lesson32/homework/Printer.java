package by.kursy.luschik.javalessons.lesson32.homework;

import java.util.concurrent.TimeUnit;

public class Printer {
    public static void print(String text) {
        System.out.print("[");

        try {
            TimeUnit.MILLISECONDS.sleep(100);
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                TimeUnit.MILLISECONDS.sleep(100);
            }
            TimeUnit.MILLISECONDS.sleep(100);

        } catch (InterruptedException e) {
            System.err.println(e);
        }

        System.out.println("]");
    }
}