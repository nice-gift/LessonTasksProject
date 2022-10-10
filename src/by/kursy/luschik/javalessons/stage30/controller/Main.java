package by.kursy.luschik.javalessons.stage30.controller;

import by.kursy.luschik.javalessons.stage30.model.entity.Dock;
import by.kursy.luschik.javalessons.stage30.model.entity.Port;
import by.kursy.luschik.javalessons.stage30.model.entity.Ship;
import by.kursy.luschik.javalessons.stage30.model.exception.LogicalProjectException;
import by.kursy.luschik.javalessons.stage30.model.logic.Loader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws LogicalProjectException {
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Ship("Victoria", 1));
        ships.add(new Ship("Queen Anna", 6));
        ships.add(new Ship("West-Virginia", 10));

        Port port = new Port();
        port.add(new Dock(1, 4));
        port.add(new Dock(2, 5));

        Loader.download(ships.get(0), port.get(0));
        System.out.println(port);
        System.out.println(ships);
    }
}

