package by.kursy.luschik.javalessons.lesson23ooptask.iterator;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;

public interface Iterator {
    Flower next();
    boolean hasNext();
    void reset();
}
