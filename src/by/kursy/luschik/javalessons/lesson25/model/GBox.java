package by.kursy.luschik.javalessons.lesson25.model;

public class GBox<T> {
    private T value;

    public GBox() {
    }

    public GBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
