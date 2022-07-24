package by.kursy.luschik.javalessons.lesson29.model;

import java.io.*;

public class NumberParser {
    private static String fileName = "C:/test/number.bin";

    public static void writeIntegerNumber(int number) {
        try (OutputStream stream = new FileOutputStream(fileName)) {
            int n1 = number >>> 24;
            int n2 = (number >>> 16) & 255;
            int n3 = (number >>> 8) & 255;
            int n4 = number & 255;

            stream.write(n1);
            stream.write(n2);
            stream.write(n3);
            stream.write(n4);
            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static int readIntegerNumber() {
        int number = 0;
        try (InputStream stream = new FileInputStream(fileName)) {
            int n1 = stream.read();
            int n2 = stream.read();
            int n3 = stream.read();
            int n4 = stream.read();
            number = (n1 << 24) + (n2 << 16) + (n3 << 8) + n4;
        } catch (IOException exception) {
            System.err.println(exception);
        }

        return number;
    }
}
