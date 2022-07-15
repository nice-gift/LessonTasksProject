package by.kursy.luschik.javalessons.lesson25.JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CustomCollection implements Iterable<Integer>{
    private Collection<Integer> integers;

    public CustomCollection() {
        integers = new ArrayList<>();
    }

    public CustomCollection(Collection<Integer> integers) {
        this.integers = integers;
    }

    public void add(int number) {
        integers.add(number);
    }

    public void remove(int number) {
        integers.remove(number);
    }

    public void clear() {
        integers.clear();
    }

    public int size() {
        return integers.size();
    }

    public String toString() {
        Iterator<Integer> it = integers.iterator();
        StringBuilder builder = new StringBuilder();

        while (it.hasNext()) {
            builder.append(it.next()).append(" ");
        }

        return builder.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return integers.iterator();
    }
}
