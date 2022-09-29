
package by.kursy.luschik.javalessons.lesson32.homework;

public class WriterThread implements Runnable {
    private Thread thread;
    private String text;

    public WriterThread(String text) {
        thread = new Thread(this);
        this.text = text;
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        Printer.print(text);
    }
}