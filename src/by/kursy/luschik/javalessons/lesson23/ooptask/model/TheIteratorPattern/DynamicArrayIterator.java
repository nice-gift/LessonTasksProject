package by.kursy.luschik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;
import by.kursy.luschik.javalessons.lesson23.ooptask.model.container.DynamicArray;

public class DynamicArrayIterator implements Iterator {
    private DynamicArray array;
    private int current = 0;

    public DynamicArrayIterator(DynamicArray array) {
        this.array = array;
    }

    @Override
    public Flower next() {
        return array.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < array.size();
    }

    @Override
    public void reset() {
        current = 0;
    }
}
