package by.kursy.luschik.javalessons.lesson12.Task2.controller;


import by.kursy.luschik.javalessons.lesson12.Task2.modellogic.Manager;
import by.kursy.luschik.javalessons.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MAX_VALUE =100;
    public static final int MIN_VALUE =0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input count of numbers: ");
        int count= scanner.nextInt();

        int[] numbers=new int[count];
        Random random=new Random();
        String m="";
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt((MAX_VALUE-MIN_VALUE+1)+
                    MIN_VALUE);
            m+=numbers[i]+" ";
        }
        int sum = Manager.sumOddNumbers(numbers);
        String s=String.format("Sum of odd numbers is %d",sum);
        Printer.print(m+"\n"+s);
    }
}

