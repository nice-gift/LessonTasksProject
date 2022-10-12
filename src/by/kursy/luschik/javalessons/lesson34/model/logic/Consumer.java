package by.kursy.luschik.javalessons.lesson34.model.logic;

import by.kursy.luschik.javalessons.lesson34.model.entity.Market;

public class Consumer implements Runnable {
    private boolean running;
    private Market market;

    public Consumer(Market market) {
        this.market = market;
        running = true;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        while (running) {
            market.get();
        }
    }

    public void stop() {
        running = false;
    }
}
