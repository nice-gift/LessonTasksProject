package by.kursy.luschik.javalessons.lesson32.homework;

public class Main {
    public static void main(String[] args) {
        WriterThread writerThread = new WriterThread("Writer Thread");
        Thread thread1 = new Thread(writerThread);
        writerThread.setText("Kek");
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        String text = "Main thread";

        Printer.print(text);
    }
}
