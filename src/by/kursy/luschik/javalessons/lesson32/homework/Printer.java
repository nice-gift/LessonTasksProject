package by.kursy.luschik.javalessons.lesson32.homework;

public class Printer {
    public static void print(String text) {
        System.out.print("[");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        System.out.println("]");
    }
}
