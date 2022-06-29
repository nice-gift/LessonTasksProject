package by.kursy.luschik.javalessons.lesson14.task04;
import by.kursy.luschik.javalessons.lesson14.ArraySort;

import by.kursy.luschik.javalessons.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 6, 8, 9, 1};
        Printer.print("Before sorting: ");
        Printer.print(Arrays.toString(array));

        ArraySort.selectedSort(array);

        Printer.print("\nAfter sorting: ");
        Printer.print(Arrays.toString(array));
    }
}
