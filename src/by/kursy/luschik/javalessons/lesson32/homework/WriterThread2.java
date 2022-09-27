
package by.kursy.luschik.javalessons.lesson32.homework;

public class WriterThread2 implements Runnable {
    private String text;

    public WriterThread2() {
        text = "";
    }

    public WriterThread2(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void run() {
        Printer.print(text);
    }
}