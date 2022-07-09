package by.kursy.luschik.javalessons.lesson23ooptask.controller;

import by.kursy.luschik.javalessons.lesson23ooptask.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterator iterator;


    }

    public static void view(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

