package by.kursy.luschik.javalessons.lesson16;

import java.util.Random;

public class Task03 {
    private static final int MAX_GROUP_NUMBERS = 10;
    private static final int MIN_GROUP_NUMBERS = 5;

    private static final int MAX_STUDENTS_NUMBERS = 10;
    private static final int MIN_STUDENTS_NUMBERS = 2;

    private static final int MAX_MARKS = 10;
    private static final int MIN_MARKS = 2;

    private static final Random rnd = new Random();

    public static int[][] createGroups() {
        int number = rnd.nextInt(MAX_GROUP_NUMBERS - MIN_GROUP_NUMBERS + 1)+MIN_GROUP_NUMBERS;
        int[][] groups = new int[number][];

        for (int i = 0; i < groups.length; i++) {
            number = rnd.nextInt(MAX_STUDENTS_NUMBERS - MIN_STUDENTS_NUMBERS + 1)+MIN_STUDENTS_NUMBERS;
            groups[i] = new int[number];
        }
        return groups;
    }

    public static void showAllGroups(int[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            System.out.print("Group(" + (i + 1) + "):");
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] groups = createGroups();

        showAllGroups(groups);
    }
}
