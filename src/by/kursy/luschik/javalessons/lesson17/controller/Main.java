package by.kursy.luschik.javalessons.lesson17.controller;

import by.kursy.luschik.javalessons.lesson17.model.Human;
import by.kursy.luschik.javalessons.lesson17.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", 18, 11, true);
        System.out.println(student);
        student=test(student);
        System.out.println(student);
    }

    public static Student test (Student st){

        Student s = new Student();
        s.setAge(6);
        return s;
    }
}
