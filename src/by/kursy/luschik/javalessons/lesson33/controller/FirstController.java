package by.kursy.luschik.javalessons.lesson33.controller;

import by.kursy.luschik.javalessons.lesson33.model.ThirdThread;

import java.util.concurrent.TimeUnit;

public class FirstController {
    public static void main(String[] args) {
        ThirdThread thread = new ThirdThread();

        thread.setPriority(Thread.MIN_PRIORITY);

        Thread main = Thread.currentThread();
        main.setPriority(Thread.MAX_PRIORITY);

        while (true) {
            System.out.println("Main thread is running...");

//            try {
//                TimeUnit.MILLISECONDS.sleep(100);
//            } catch (InterruptedException e) {
//                System.err.println(e);
//            }
        }
    }
}
