package by.kursy.luschik.javalessons.lesson17.model;

public class Student extends Human {

    public static final int MAX_STUDENT_AGE = 80;
    public static final int MIN_STUDENT_AGE = 16;

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;
    private boolean alive;

    private String name;

    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public Student(String name, int age, double mark, boolean alive) {
        super(name, age);
        this.mark = mark;
        this.alive = alive;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", mark=" + mark +
                ", alive=" + (alive ? "yes" : "no");
    }
}
