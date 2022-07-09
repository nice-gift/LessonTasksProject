package by.kursy.luschik.javalessons.lesson16.arrayofaray;

import java.util.Arrays;
import java.util.Random;

public class TestOfArray {

    public static void init(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[4][5];


        System.out.println("Before: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        init(matrix);
        System.out.println("After");
        System.out.println((Arrays.deepToString(matrix)));
    }


}
