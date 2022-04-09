package by.kursy.luschik.javalessons.lesson12.Task1.modellogic;

public class Manager {
    public static double calcAvgMark(int[] marks) {
        double sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }

        return sum / marks.length;
    }
}