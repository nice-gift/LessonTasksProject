package by.kursy.luschik.javalessons.stage30.model.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Port implements Iterable<Dock> {
    private Collection<Dock> docks;

    public Port() {
        docks = new ArrayList<Dock>();
    }

    public Port(Collection<Dock> docks) {
        if (docks != null) {
            this.docks = docks;
        }
    }

    public void add(Dock dock) {
        docks.add(dock);
    }

    public Dock get(int index) {
        int count = 0;
        while (iterator().hasNext()) {
            count++;
            if (count == index) {
                break;
            }
        }
        return iterator().next();
    }

    @Override
    public Iterator<Dock> iterator() {
        return docks.iterator();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("List of docks:\n");
        for (Dock dock : docks) {
            buffer.append(dock).append("\n");
        }

        return buffer.toString();
    }
}
