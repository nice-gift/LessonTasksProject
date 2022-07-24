package by.kursy.luschik.javalessons.lesson28.model;

import java.io.*;
import java.util.Scanner;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;

        try {
            stream = new FileOutputStream(fileName);
            for (int i = 0; i < 100; i++) {
                stream.write(i);
            }
            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

    }

    public static String read(String fileName) {
        InputStream stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileInputStream(fileName);

//            int number;

//            while ((number = stream.read()) != -1) {
//                builder.append(number).append(" ");
//            }

            while (stream.available()>0) {
                int number=stream.read();
                builder.append(number).append(" ");
            }

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

        return builder.toString();
    }
}
