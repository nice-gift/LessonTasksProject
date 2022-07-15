package by.kursy.luschik.javalessons.lesson19;

public class MarksNote {
    private double mark;

    public MarksNote() {
        mark = 4;
    }

    public MarksNote(double mark) {
        this.mark = mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public String toString() {
        return mark + "";
    }
}
