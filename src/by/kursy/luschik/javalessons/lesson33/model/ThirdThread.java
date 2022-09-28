package by.kursy.luschik.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;

public class ThirdThread extends Thread {

    public ThirdThread() {
        start();
    }

    @Override
    public void run() {
        String name = getName();

        while (true) {
            System.out.printf("Child thread %s is running...\n", name);

//            try {
//                TimeUnit.MILLISECONDS.sleep(100);
//            } catch (InterruptedException e) {
//                System.err.println(e);
//            }
        }
    }
}