package by.kursy.luschik.javalessons.lesson34.model.logic;

import by.kursy.luschik.javalessons.lesson34.model.entity.Market;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private boolean running;
    private Market market;

    public Producer(Market market) {
        this.market = market;
        running = true;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int product = 0;
        while (running) {
            product++;
            market.send(product);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    public void stop() {
        running = false;
    }
}
