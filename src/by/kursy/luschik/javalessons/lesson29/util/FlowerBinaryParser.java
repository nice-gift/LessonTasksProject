package by.kursy.luschik.javalessons.lesson29.util;

import by.kursy.luschik.javalessons.lesson18.ooptask.model.exception.FlowerPriceWrongException;
import by.kursy.luschik.javalessons.lesson29.model.Flower;

import java.io.*;

public class FlowerBinaryParser {
    public static void write(String fileName, Flower flower) {
        try (DataOutputStream stream =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(fileName)))) {
            stream.writeUTF(flower.getName());
            stream.writeUTF(flower.getColor());
            stream.writeDouble(flower.getWeight());
            stream.writeDouble(flower.getPrice());
            stream.writeInt(flower.getLength());

//            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Flower read(String fileName) throws FlowerPriceWrongException {
        Flower temp = new Flower();

        try (DataInputStream stream =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(fileName)))) {
            temp.setName(stream.readUTF());
            temp.setColor(stream.readUTF());
            temp.setWeight(stream.readDouble());
            temp.setPrice(stream.readDouble());
            temp.setLength(stream.readInt());

        } catch (IOException exception) {
            System.err.println(exception);
        }
        return temp;
    }
}
