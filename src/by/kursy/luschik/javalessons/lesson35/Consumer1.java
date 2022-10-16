package by.kursy.luschik.javalessons.lesson35;

public class Consumer1 implements Runnable {
    private Market1 market1;
    private boolean running;

    public Consumer1(Market1 market1) {
        this.market1 = market1;
        new Thread(this, "Producer").start();
        running = true;
    }

    @Override
    public void run() {

        while (true) {
            market1.get();
        }
    }
}
