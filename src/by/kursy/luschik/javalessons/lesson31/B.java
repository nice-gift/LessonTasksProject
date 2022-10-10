package by.kursy.luschik.javalessons.lesson31;

import java.io.IOException;
import java.io.Serializable;

public class B extends A {
    public boolean flag;
    public int field;

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();
        out.writeDouble(value);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", flag=" + flag +
                ", field=" + field;
    }
}
