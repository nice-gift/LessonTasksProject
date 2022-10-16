package by.kursy.luschik.javalessons.stage30;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();

        String[] strings={
                "first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < strings.length; i++) {
            new Consumer(market, strings[i]);
        }

        for (int i = 0; i < 3; i++) {
            new Producer(market, strings[i]);
        }
    }
}
