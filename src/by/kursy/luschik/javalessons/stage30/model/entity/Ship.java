package by.kursy.luschik.javalessons.stage30.model.entity;

import by.kursy.luschik.javalessons.stage30.model.exception.ShipNumOfContainersWrongException;

public class Ship implements Runnable {
    public static final int MAX_SHIP_CONTAINER_CAPACITY = 10;

    private String name;
    private int numOfContainers;
    private Thread thread;

    public Ship(String name, int numOfContainers) throws ShipNumOfContainersWrongException {
        this.name = name;
        if (numOfContainers >= 0 && numOfContainers <= MAX_SHIP_CONTAINER_CAPACITY) {
            this.numOfContainers = numOfContainers;
        } else throw new ShipNumOfContainersWrongException();
        thread = new Thread(this);
        thread.start();
    }

    public Ship(Ship ship) throws ShipNumOfContainersWrongException {
        this(ship.name, ship.numOfContainers);
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }

    public void addContainer() {
        numOfContainers++;
    }

    public void removeContainer() {
        numOfContainers--;
    }

    @Override
    public String toString() {
        return "name = " + name + ", numOfContainers = " + numOfContainers;
    }

    @Override
    public void run() {

    }
}
