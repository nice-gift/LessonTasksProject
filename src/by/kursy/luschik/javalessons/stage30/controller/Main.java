package by.kursy.luschik.javalessons.stage30.controller;

import by.kursy.luschik.javalessons.stage30.model.entity.Ship;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Ship("Victoria", 8));
        ships.add(new Ship("Queen Anna", 6));
        ships.add(new Ship("West-Virginia", 10));


    }
}

