package by.kursy.luschik.javalessons.lesson29.util;

import by.kursy.luschik.javalessons.lesson31.B;

import java.io.*;

public class Serializer<T> {
    public String fileName = "c:/test/b.bin";

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void serializer(T t) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            stream.writeObject(t);
            stream.flush();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public T deserializer() {
        T t = null;
        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            t = (T) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return t;
    }
}
