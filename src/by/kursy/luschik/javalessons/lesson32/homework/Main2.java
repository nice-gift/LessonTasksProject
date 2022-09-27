package by.kursy.luschik.javalessons.lesson32.homework;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Thread> treads = new ArrayList<>();

        treads.add(new Thread(new WriterThread("kek")));
        treads.add(new Thread(new WriterThread("kewk")));
        treads.add(new Thread(new WriterThread("keek")));
        treads.add(new Thread(new WriterThread("kerk")));
        treads.add(new Thread(new WriterThread("ketk")));
        treads.add(new Thread(new WriterThread("keyk")));
        treads.add(new Thread(new WriterThread("keuk")));


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
