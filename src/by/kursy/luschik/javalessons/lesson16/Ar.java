package by.kursy.luschik.javalessons.lesson16;

import java.util.Arrays;
import java.util.Random;

public class Ar {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[][] array = new int[rnd.nextInt(10)][];

        for (int i = 0; i < array.length; i++) {

            array[i] = new int[rnd.nextInt(10)];
        }
        show(array);

        init(array);
        show(array);
    }


    public static void init(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = rnd.nextInt(10);
//                System.out.print(array[i][j] + "\t");
//
//                if (i == j) {
//                    sum += array[i][j];
//                }
//            }


//    private static int sum(int[][] array) {
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            int j = array.length -1- i;
//            sum += array[i][j];
//        }
//        return sum;
//    }
//}