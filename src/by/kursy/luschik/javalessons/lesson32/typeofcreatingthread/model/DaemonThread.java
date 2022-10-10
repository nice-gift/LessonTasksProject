package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        boolean isDaemon = Thread.currentThread().isDaemon();

//        while (true)
//            try {
//                System.out.printf("msg from %d  %s tread...\n", id, name);
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.println(e);
//            }
//    }
//}
        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("msg from %d) %s daemon tread... ", id, name);
                System.out.printf("Is daemon - %b\n", isDaemon);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.printf("Child daemon thread %s finished. \n", name);
    }
}