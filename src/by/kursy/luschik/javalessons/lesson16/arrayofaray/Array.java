package by.kursy.luschik.javalessons.lesson16.arrayofaray;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        int[][] array = new int[4][5];
        System.out.println(Arrays.deepToString(array));

        init(array);

        System.out.println(Arrays.deepToString(array));
    }


    private static void init(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
    }
}
