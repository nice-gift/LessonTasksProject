package by.kursy.luschik.javalessons.lesson33.controller;

import by.kursy.luschik.javalessons.lesson33.model.FourthThread;

import java.util.concurrent.TimeUnit;

public class FourthController {
    public static void main(String[] args) throws InterruptedException {
        FourthThread thread = new FourthThread();
        TimeUnit.SECONDS.sleep(2);
        thread.stop();
        System.out.println("Main thread finished.");
    }
}
