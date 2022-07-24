package by.kursy.luschik.javalessons.lesson28.controlller;

import by.kursy.luschik.javalessons.lesson28.model.BinaryWorker;
import by.kursy.luschik.javalessons.lesson28.model.CharWorker;

public class Main {
    public static void main(String[] args) {
//        String fileName = "c:\\test\\test.bin";
        String fileName = "c:\\test\\test.txt";
//        BinaryWorker.write(fileName);
//        System.out.println(BinaryWorker.read(fileName));
        CharWorker.write(fileName);
        System.out.println(CharWorker.read(fileName));
    }
}
