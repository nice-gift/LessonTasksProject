package by.kursy.luschik.javalessons.lesson20.controller;

import by.kursy.luschik.javalessons.lesson20.entity.abstracts.Figure;
import by.kursy.luschik.javalessons.lesson20.entity.figures.Line;
import by.kursy.luschik.javalessons.lesson20.entity.figures.Point;
import by.kursy.luschik.javalessons.lesson20.entity.figures.Triangle;

public class Main {
    public static void test(Figure[] figures) {
        for (Figure figure : figures
        ) {
            System.out.println(figure);
            System.out.println("Perimeter = " + figure.calculatePerimeter());
            figure.draw();
        }
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Line(1, 1, 10),
                new Point(),
                new Triangle(2, 1, 3, 4, 5),
        };

        for (Figure f :
                figures) {
            f.draw();
        }

        test(figures);
    }

}
