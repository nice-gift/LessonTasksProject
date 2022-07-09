package by.kursy.luschik.javalessons.lesson24.controller;

import by.kursy.luschik.javalessons.lesson24.model.WeekDay;
import by.kursy.luschik.javalessons.lesson24.model.WeekDayEnum;


enum Color {
    RED, GREEN, BLUE;

    Color() {
        System.out.println("Color constructor");
    }
}


public class Main {
    public static void main(String[] args) {
//        Color color= Color.RED;

        WeekDayEnum day1 = WeekDayEnum.FRIDAY;
        WeekDay day2 = WeekDay.TUESDAY;
        WeekDay day3 = WeekDay.WEDNESDAY;
        WeekDay day4 = WeekDay.THURSDAY;
        WeekDay day5 = WeekDay.FRIDAY;
        WeekDay day6 = WeekDay.SATURDAY;
        WeekDay day7 = WeekDay.SUNDAY;

        System.out.println(day1);
        System.out.println(day5);

        justDoIt(Color.BLUE);
    }

    public static void justDoIt(Color color) {
        String s = "no color";
        switch (color) {
            case BLUE:
                s = "blue";
            case GREEN:
                s = "green";
        }
        System.out.println(s);
    }
}
