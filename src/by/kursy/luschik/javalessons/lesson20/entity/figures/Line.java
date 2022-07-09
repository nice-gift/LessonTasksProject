package by.kursy.luschik.javalessons.lesson20.entity.figures;

import by.kursy.luschik.javalessons.lesson20.entity.abstracts.Figure;

public class Line extends Figure {
    private double length;

    public Line() {
    }

    public Line(int x, int y) {
        super(x, y);
    }

    public Line(double length) {
        this.length = length;
    }

    public Line(int x, int y, double length) {
        super(x, y);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public double calculatePerimeter() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Line is being drawn");
    }

    @Override
    public String toString() {
        return super.toString() + ", length=" + length;
    }
}
