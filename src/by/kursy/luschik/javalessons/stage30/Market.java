package by.kursy.luschik.javalessons.stage30;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Market {
    private BlockingQueue<Integer> queue;

    public Market() {
        queue = new ArrayBlockingQueue<>(1);
    }

    //    producer sends product
    public void sendProduct(int product, String name) {
        try {
            queue.put(product);
            System.out.printf("producer %s sends product %d \n", name, product);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    //    consumer gets product
    public int getProduct(String name) {
        int product = 0;

        try {
            product = queue.take();
            String str = String.format("consumer %s gets product %d \n", name, product);
            System.out.println(str);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        return product;
    }
}
