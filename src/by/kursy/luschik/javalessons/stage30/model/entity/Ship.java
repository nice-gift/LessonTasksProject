package by.kursy.luschik.javalessons.stage30.model.entity;

public class Ship {
    public static final int MAX_SHIP_CONTAINER_CAPACITY = 10;

    private String name;
    private int numOfContainers;

    public Ship() {
        numOfContainers = 0;
        name = "no name";
    }

    public Ship(String name, int numOfContainers) {
        this.name = name;
        this.numOfContainers = numOfContainers;
    }

    public Ship(Ship ship) {
        this(ship.name, ship.numOfContainers);
    }
}
