package by.kursy.luschik.javalessons.lesson33.model;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;
    private Object object;

    public Writer(String text, Printer printer, Object object) {
        thread = new Thread(this);
        this.text = text;
        this.printer = printer;
        this.object = object;
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        synchronized (object) {
            printer.print(text);
        }
    }
}
