package by.kursy.luschik.javalessons.lesson25.controller;

import by.kursy.luschik.javalessons.lesson25.model.FloatBox;
import by.kursy.luschik.javalessons.lesson25.model.Student;
import by.kursy.luschik.javalessons.lesson25.model.StudentBox;

public class Main {
    public static void main(String[] args) {

        FloatBox box1 = new FloatBox();
        box1.setValue(10);
        double n = box1.getValue();
        System.out.println(box1);

        StudentBox box = new StudentBox();
        box.setValue(new Student());
        Student s = box.getValue();
        System.out.println(box);
    }
}
