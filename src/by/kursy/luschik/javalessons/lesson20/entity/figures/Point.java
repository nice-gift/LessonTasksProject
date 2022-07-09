package by.kursy.luschik.javalessons.lesson20.entity.figures;

import by.kursy.luschik.javalessons.lesson20.entity.abstracts.Figure;

public class Point extends Figure {
    public Point() {
    }

    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Point is being drawn");
    }

}
