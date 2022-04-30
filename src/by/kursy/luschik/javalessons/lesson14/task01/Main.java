package by.kursy.luschik.javalessons.lesson14.task01;

import by.kursy.luschik.javalessons.lesson14.ArraySorter;
import by.kursy.luschik.javalessons.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 6, 8, 9, 4,};
        Printer.print("Before sorting: ");
        Printer.print(Arrays.toString(array));

        ArraySorter.bubbleSortAsc(array);

        Printer.print("\nAfter sorting: ");
        Printer.print(Arrays.toString(array));
    }
}
