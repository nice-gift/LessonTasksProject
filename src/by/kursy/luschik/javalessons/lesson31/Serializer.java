package by.kursy.luschik.javalessons.lesson31;

import java.io.*;

public class Serializer {
    public static String fileName = "c:/test/b.bin";

    public static void serializer(B b) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            stream.writeObject(b);
            stream.flush();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static B deserializer() {
        B b = null;
        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            b = (B) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return b;
    }
}
