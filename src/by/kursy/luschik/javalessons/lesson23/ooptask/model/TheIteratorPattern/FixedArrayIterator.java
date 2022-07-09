package by.kursy.luschik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.container.FixedArray;
import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;

public class FixedArrayIterator implements Iterator {
    private FixedArray array;
    private int current = 0;

    public FixedArrayIterator(FixedArray array) {
        this.array = array;
    }

    @Override
    public Flower next() {
        return array.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
        if (!flag) {
            current = 0;
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
