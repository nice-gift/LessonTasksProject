package by.kursy.luschik.javalessons.lesson25.model;

public class FloatBox {

    private double value;

    public FloatBox() {
    }

    public FloatBox(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}

