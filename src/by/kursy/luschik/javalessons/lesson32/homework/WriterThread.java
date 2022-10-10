
package by.kursy.luschik.javalessons.lesson32.homework;

public class WriterThread implements Runnable {
    private Thread thread;
    private String text;
    private Object object;

    public WriterThread(String text, Object object) {
        thread = new Thread(this);
        this.text = text;
        this.object = object;
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
        synchronized (object) {
            Printer.print(text);
        }
    }
}