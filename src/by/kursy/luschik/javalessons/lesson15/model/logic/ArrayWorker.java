package by.kursy.luschik.javalessons.lesson15.model.logic;

public class ArrayWorker {
    public static void reverse(int[] array) {
        //fool proof
        if (array == null) {
            return;
        }

        int size = array.length / 2;
        for (int i = 0; i < size; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }
}
