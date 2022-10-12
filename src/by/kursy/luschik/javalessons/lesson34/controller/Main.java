package by.kursy.luschik.javalessons.lesson34.controller;

import by.kursy.luschik.javalessons.lesson34.model.entity.Market;
import by.kursy.luschik.javalessons.lesson34.model.logic.Consumer;
import by.kursy.luschik.javalessons.lesson34.model.logic.Producer;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        new Producer(market);
        new Consumer(market);
    }
}
