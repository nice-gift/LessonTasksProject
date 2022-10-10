package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.controller;

import by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model.DaemonThread;
import by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model.SecondThread;

public class FifthController {
    public static void main(String[] args) {
        System.out.println("The main thread started");

        int count = 5;
        SecondThread threadFunction = new SecondThread();
        DaemonThread daemonThread = new DaemonThread();

        Thread[] threads = new Thread[count];

        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(threadFunction);
            threads[i].start();
        }

        for (int i = 2; i < threads.length; i++) {
            threads[i] = new Thread(daemonThread);
            threads[i].setDaemon(true);
            threads[i].start();
        }

//        try {
//            for (int i = 0; i < threads.length; i++) {
//                threads[i].join();
//            }
//        } catch (InterruptedException e) {
//            System.err.println(e);
//        }

        System.out.println("The main thread finished");
    }
}

