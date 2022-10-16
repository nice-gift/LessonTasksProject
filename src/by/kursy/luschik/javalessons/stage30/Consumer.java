package by.kursy.luschik.javalessons.stage30;

public class Consumer implements Runnable {
    private Market market;
    private boolean running;
    private String name;

    public Consumer(Market market, String name) {
        this.market = market;
        this.name=name;
        running = true;
        new Thread(this, name).start();
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
                market.getProduct(name);
        }
    }
}
