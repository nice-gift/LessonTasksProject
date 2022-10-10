package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.controller;

import by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model.FirstThread;

public class FirstController {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start(); /*запуск потока*/
        FirstThread thread2 = new FirstThread();
        FirstThread thread3= new FirstThread();
        FirstThread thread4 = new FirstThread();
        thread2.start();
        thread3.start();
        thread4.start();


        Thread mainThread = Thread.currentThread();
        String name = mainThread.getName();
        Long id = mainThread.getId();
        while (true)
            try {
                System.out.printf("msg from %d %s tread...\n", id, name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
    }
}
