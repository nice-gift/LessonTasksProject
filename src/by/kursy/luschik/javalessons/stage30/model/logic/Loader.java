package by.kursy.luschik.javalessons.stage30.model.logic;

import by.kursy.luschik.javalessons.stage30.model.entity.Dock;
import by.kursy.luschik.javalessons.stage30.model.entity.Ship;

import static by.kursy.luschik.javalessons.stage30.model.entity.Ship.MAX_SHIP_CONTAINER_CAPACITY;

public class Loader {
    public static void download(Ship ship, Dock dock) {
        while (ship.getNumOfContainers() != MAX_SHIP_CONTAINER_CAPACITY ||dock.getNumOfContainers() != 0) {
            ship.removeContainer();
            dock.addContainer();
            if (dock.getNumOfContainers() == 0) {
                return;
            }
        }
    }

    public static void unload() {
    }
}
