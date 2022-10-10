package by.kursy.luschik.javalessons.lesson32.typeofcreatingthread.model;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();

//        while (true)
//            try {
//                System.out.printf("msg from %d  %s tread...\n", id, name);
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.println(e);
//            }
//    }
//}
        for (int i = 0; i < 50; i++) {
            try {
                System.out.printf("msg from %d  %s tread...\n", id, name);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        System.out.printf("Child thread %s finished. \n", name);
    }
}