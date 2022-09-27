package by.kursy.luschik.javalessons.lesson32.homework;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Thread> treads = new ArrayList<>();

        treads.add(new Thread(new WriterThread("print this1")));
        treads.add(new Thread(new WriterThread("print this2")));
        treads.add(new Thread(new WriterThread("print this3")));
        treads.add(new Thread(new WriterThread("print this4")));
        treads.add(new Thread(new WriterThread("print this5")));

        treads.get(0).start();

        try {
            for (int i = 1; i < treads.size(); i++) {
                treads.get(i - 1).join();
                treads.get(i).start();
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }

    }
}
