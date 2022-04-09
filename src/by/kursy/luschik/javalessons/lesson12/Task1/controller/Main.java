package by.kursy.luschik.javalessons.lesson12.Task1.controller;

import by.kursy.luschik.javalessons.lesson12.Task1.modellogic.Manager;
import by.kursy.luschik.javalessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Printer.print("Input count of students: ");
        int count= scanner.nextInt();

        int[] marks=new int[count];

        Printer.print("Input marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i]= scanner.nextInt();
        }
        double avg = Manager.calcAvgMark(marks);

        String result = String.format("\nStudent's average mark = %.2f", avg);
        Printer.print(result);
    }
}
