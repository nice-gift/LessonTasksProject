package by.kursy.luschik.javalessons.lesson13.Task6;

public class LinSearching {
    public static int findSecondValue(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
    }
}
