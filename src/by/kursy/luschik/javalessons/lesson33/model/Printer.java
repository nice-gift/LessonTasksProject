package by.kursy.luschik.javalessons.lesson33.model;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Printer {

    private Semaphore semaphore;

    public Printer() {
        semaphore = new Semaphore(5, true);
    }


    public void print(String text) {
        try {
            semaphore.acquire();
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
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            semaphore.release();
        }
    }
}


