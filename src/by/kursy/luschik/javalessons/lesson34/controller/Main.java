package by.kursy.luschik.javalessons.lesson34.controller;

import by.kursy.luschik.javalessons.lesson34.model.entity.Market;
import by.kursy.luschik.javalessons.lesson34.model.logic.Consumer;
import by.kursy.luschik.javalessons.lesson34.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        new Producer(market);
        TimeUnit.MILLISECONDS.sleep(500);

        new Consumer(market);
    }
}
