package by.kursy.luschik.javalessons.lesson13.Task1;

public class LinearSearching {
//    public static boolean checkValue(int[] array, int value) {
//        boolean flag = false;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }
//}

    public static boolean checkValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    public static int findFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public static int findLastIndex(int[] array, int value) {
        for (int i = array.length-1; i >=0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int countValue (int [] array, int value) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]== value) {
                count++;
            }
        }

        return count;
    }

}