package by.kursy.luschik.javalessons.lesson14;

public class ArraySort {
    public static void bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag = false;
                }
                count++;
            }
            if (flag) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void bubbleSortDsc(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag = false;
                }
                count++;
            }
            if (flag == true) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }

    public static void insertionSortDsc(int[] arrray) {
        int count = 0;
        for (int i = 1; i < arrray.length; i++) {
            int element = arrray[i];
            int j = i - 1;
            count++;
            while (j >= 0 && arrray[j] < element) {
                arrray[j + 1] = arrray[j];
                j--;
                count++;
            }
            arrray[j + 1] = element;
        }
        System.out.println(count);
    }

    public static void selectedSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
//            boolean flag = true;
//            for (int k = i; k < array.length-1; k++) {
//                if (array[k] > array[k + 1]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag == true) {
//                break;
//            }
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
                count++;
            }
            int t = array[indexMin];
            array[indexMin] = array[i];
            array[i] = t;
        }
        System.out.println(count);
    }
}
