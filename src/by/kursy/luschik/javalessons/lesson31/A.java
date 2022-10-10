package by.kursy.luschik.javalessons.lesson31;

import java.io.Serializable;

public class A implements Serializable{
    public static final long serialVersionUID = 42L;
    public int number;
    public transient double value;
    public String name;

    @Override
    public String toString() {
        return "number=" + number +
                ", value=" + value +
                ", name=" + name;
    }
}
