package by.kursy.luschik.javalessons.lesson23.ooptask.model.TheIteratorPattern;

import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    private ArrayList list;
    private int current = 0;

    public ArrayListIterator(ArrayList arrayList) {
        list = arrayList;
    }

    @Override
    public Flower next() {
        return (Flower) list.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < list.size();
        if (!flag) {
            reset();
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
