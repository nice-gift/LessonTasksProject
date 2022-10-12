package by.kursy.luschik.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    private Lock lock;

    public Printer() {
        lock = new ReentrantLock();
    }

    public Lock getLock() {
        return lock;
    }

    public void print(String text) {

        System.out.print("[");

        try {
            TimeUnit.MILLISECONDS.sleep(100);
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("]");
    }
}


