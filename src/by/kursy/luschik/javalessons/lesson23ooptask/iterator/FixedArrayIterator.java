package by.kursy.luschik.javalessons.lesson23ooptask.iterator;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;
import by.kursy.luschik.javalessons.lesson23ooptask.model.container2.FixedArray;

public class FixedArrayIterator implements Iterator {
    FixedArray array;
    int current = 0;

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
