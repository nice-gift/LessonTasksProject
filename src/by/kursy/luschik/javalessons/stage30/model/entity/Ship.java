package by.kursy.luschik.javalessons.stage30.model.entity;

public class Ship implements Runnable {
    public static final int MAX_SHIP_CONTAINER_CAPACITY = 10;

    private String name;
    private int numOfContainers;
    private Thread thread;

    public Ship(String name, int numOfContainers) {
        this.name = name;
        this.numOfContainers = numOfContainers;
        thread = new Thread(this);
        thread.start();
    }

    public Ship(Ship ship) {
        this(ship.name, ship.numOfContainers);
    }

    @Override
    public void run() {

    }
}
