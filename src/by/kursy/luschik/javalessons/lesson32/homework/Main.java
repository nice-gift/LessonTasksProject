package by.kursy.luschik.javalessons.lesson32.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WriterThread> treads = new ArrayList<>();

        treads.add(new WriterThread("print this1"));
        treads.add(new WriterThread("print this2"));
        
    }
}
