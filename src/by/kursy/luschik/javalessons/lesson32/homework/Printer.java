package by.kursy.luschik.javalessons.lesson32.homework;

public class Printer {
    public static void print(String text) {
        System.out.println("[");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        System.out.println("]");
    }
}
