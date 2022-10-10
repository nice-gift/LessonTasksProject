package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.controller;

import by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model.SecondThread;

public class FourthController {
    public static void main(String[] args) {
        System.out.println("The main thread started");

        SecondThread threadFunction = new SecondThread();
        Thread thread1 = new Thread(threadFunction);
        Thread thread2 = new Thread(threadFunction);
        Thread thread3 = new Thread(threadFunction);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        while (true) {
            if (thread1.isAlive() == false
                    && thread2.isAlive() == false
                    && thread3.isAlive() == false) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        System.out.println("The main thread finished");
    }
}

