package by.kursy.luschik.javalessons.lesson35;

public class Producer1 implements Runnable {
    private Market1 market1;
    private boolean running;

    public Producer1(Market1 market1) {
        this.market1 = market1;
        new Thread(this, "Producer").start();
        running = true;
    }

    @Override
    public void run() {
        int product = 0;

        while (true) {
            product++;
            market1.send(product);
        }
    }
}
