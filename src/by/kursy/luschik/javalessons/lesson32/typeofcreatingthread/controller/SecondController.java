package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.controller;

import by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model.SecondThread;

public class SecondController {
    public static void main(String[] args) {
        SecondThread thread1 = new SecondThread();
        Thread thread = new Thread(thread1);
        thread.start();

        Thread mainThread = Thread.currentThread();
        String name = mainThread.getName();
        Long id = mainThread.getId();
//
//        while (true)
//            try {
//                System.out.printf("msg from %d %s tread...\n", id, name);
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.println(e);
//    }

        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("msg from %d %s tread...\n", id, name);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
