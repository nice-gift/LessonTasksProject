package by.kursy.luschik.javalessons.stage30.model.entity;

public class Dock {
    public static final int MAX_DOCK_CONTAINER_CAPACITY = 10;

    private int id;
    private int numOfContainers;
    private boolean ready;

    public Dock() {
        id = 0;
        numOfContainers = 0;
        ready = false;
    }

    public Dock(int id, int numOfContainers, boolean ready) {
        this.id = id;
        this.numOfContainers = numOfContainers;
        this.ready = ready;
    }
}
