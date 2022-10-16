package by.kursy.luschik.javalessons.lesson35;

public class Market1 {
    private int product;
    private boolean empty;

    public Market1() {
        empty = true;
    }

//    public boolean isEmpty(){
//        return empty;
//    }
//
//    public void setEmpty(boolean empty) {
//        this.empty = empty;
//    }

    public synchronized void send(int product) {
        if (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        this.product = product;
        System.out.printf("Producer sends product %d \n", product);

        empty = false;
        notify();
    }

    public synchronized int get() {
        if (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        System.out.printf("Consumer gets product %d \n", product);

        empty = true;
        notify();
        return product;
    }
}
