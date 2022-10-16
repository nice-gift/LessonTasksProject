package by.kursy.luschik.javalessons.stage30;

public class Producer implements Runnable {
    private Market market;
    private boolean running;
    private String name;

    public Producer(Market market, String name) {
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
        int count = 0;
        while (running) {
            count++;
            market.sendProduct(count, name);
        }
    }
}
