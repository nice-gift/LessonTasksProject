package by.kursy.luschik.javalessons.lesson29.controlller;

import by.kursy.luschik.javalessons.lesson18.ooptask.model.exception.FlowerPriceWrongException;
import by.kursy.luschik.javalessons.lesson29.model.Bouquet;

import by.kursy.luschik.javalessons.lesson29.model.Rose;
import by.kursy.luschik.javalessons.lesson29.util.FlowerBinaryParser;
import by.kursy.luschik.javalessons.lesson29.util.FlowerCharParser;

public class Test {
    public static void main(String[] args) throws FlowerPriceWrongException {
        String fileName ="C:/test/bouquet.txt";
        Bouquet bouquet = new Bouquet();
//        bouquet.add(new Rose("Rose", "White",2.2, 100, 70, 1,4));

//        FlowerCharParser.writeBouquet(fileName, bouquet);

        System.out.println(FlowerCharParser.readBouquet(fileName));
    }
}
