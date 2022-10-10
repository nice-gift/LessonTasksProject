package by.kursy.luschik.javalessons.stage30.model.entity;

import by.kursy.luschik.javalessons.stage30.model.exception.DockIdWrongException;
import by.kursy.luschik.javalessons.stage30.model.exception.DockNumOfContainersWrongException;
import by.kursy.luschik.javalessons.stage30.model.exception.LogicalProjectException;

public class Dock {
    public static final int MAX_DOCK_CONTAINER_CAPACITY = 10;

    private int id;
    private int numOfContainers;

    public Dock(int id, int numOfContainers) throws LogicalProjectException {
        if (id >= 0) {
            this.id = id;
        } else throw new DockIdWrongException();

        if (numOfContainers >= 0 && numOfContainers <= MAX_DOCK_CONTAINER_CAPACITY) {
            this.numOfContainers = numOfContainers;
        } else throw new DockNumOfContainersWrongException();
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
        return "id = " + id + ", numOfContainers = " + numOfContainers;
    }
}
