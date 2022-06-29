package by.kursy.luschik.javalessons.lesson14.task03;

import by.kursy.luschik.javalessons.lesson14.ArraySorter;
import by.kursy.luschik.javalessons.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array ={1,6,8,9,4,};
        Printer.print("Before sorting: ");
        Printer.print(Arrays.toString(array));

        ArraySorter.selectedSortedAsc(array);
        Printer.print("After sorting: ");
        Printer.print(Arrays.toString(array));
    }
}
