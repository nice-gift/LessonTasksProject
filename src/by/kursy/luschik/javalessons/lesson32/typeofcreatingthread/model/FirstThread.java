package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model;

public class FirstThread extends Thread {
    @Override
    public void run() {
        String name = getName();
        long id = getId();
        while (true)
            try {
                System.out.printf("msg from %d  %s tread...\n", id, name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
    }
}
