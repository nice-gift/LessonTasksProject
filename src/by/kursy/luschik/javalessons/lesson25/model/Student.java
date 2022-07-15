package by.kursy.luschik.javalessons.lesson25.model;

import by.kursy.luschik.javalessons.lesson19.MarksNote;

public class Student {

    private String name;
    public int age;
    private boolean alive;
    private MarksNote note;

    public static final int MIN_AGE = 16;
    public static final int MAX_AGE = 80;

    public static final double MIN_MARK = 4;
    public static final double MAX_MARK = 10;

    public Student() {
        name = "no name";
        age = 16;
        alive = true;
        note = new MarksNote();
    }

    public Student(String name, int age, boolean alive, double mark) {
        this(name, age, alive);
        note = new MarksNote(mark);
    }

    public Student(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public Student(String name, int age, boolean alive, MarksNote note) {
        this(name, age, alive);
        this.note = note;
        note = new MarksNote();
    }

    public MarksNote getNote() {
        return note;
    }

    public void setNote(MarksNote note) {
        this.note = note;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            note.setMark(mark);
        }
    }

    public double getMark() {
        return note.getMark();
    }

    @Override
    public String toString() {
        return name + ": age = " + age + ", alive = "
                + (alive ? "yes" : "no") + ", mark = " + note.getMark();
    }
}
