package by.kursy.luschik.javalessons.lesson13.Task2;

import by.kursy.luschik.javalessons.lesson13.Task1.LinearSearching;
import by.kursy.luschik.javalessons.lesson13.util.ArrayInitializer;
import by.kursy.luschik.javalessons.lesson13.util.Convertor;
import by.kursy.luschik.javalessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        ArrayInitializer.rndInit(array, -10, 10);


        Printer.print("\nInput value of searching: ");
        int value = scanner.nextInt();

        int firstIndex = LinearSearching.findFirstIndex(array,value);
        int lastIndex= LinearSearching.findLastIndex(array,value);

        Printer.print("\nArray: " + Convertor.convertFromArrayToString(array));
        String msg = String.format("");
        Printer.print(msg);
    }
}
