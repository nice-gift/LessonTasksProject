package by.kursy.luschik.javalessons.lesson16.controller;

import by.kursy.luschik.javalessons.lesson16.model.entity.Student;

public class Main {
public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        student.testing();

        System.out.println(student1.hashCode());
        student1.testing();
//        student.name = "Alex";
//        student.age = 20;
//        student.mark = 10;
//        student.alive = true;
//        student.sex = 'm';

        System.out.println(student.getInfo());
    }
}
