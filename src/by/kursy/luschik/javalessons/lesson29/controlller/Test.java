package by.kursy.luschik.javalessons.lesson29.controlller;

import by.kursy.luschik.javalessons.lesson18.ooptask.model.exception.FlowerPriceWrongException;
import by.kursy.luschik.javalessons.lesson29.model.Flower;
import by.kursy.luschik.javalessons.lesson29.util.FlowerBinaryParser;

public class Test {
    public static void main(String[] args) throws FlowerPriceWrongException {
        String fileName ="C:/test/flower.bin";
        Flower flower = new Flower("Rose", "White", 5.5, 0.3, 150);
        FlowerBinaryParser.write(fileName,flower);

        System.out.println(FlowerBinaryParser.read(fileName));
    }
}
