package by.kursy.luschik.javalessons.lesson23ooptask.iterator;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;

public class FixedArrayIterator implements Iterator {
    int current = 0;

    @Override
    public Flower next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
