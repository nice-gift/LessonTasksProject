package by.kursy.luschik.javalessons.lesson34.model.entity;

public class Market {
    private int product;

    public synchronized void send(int product){
        this.product=product;
        System.out.println("Producer sends --> " + product);
    }

    public synchronized int get(){
        System.out.println("Consumer gets <-- " + product);
        return product;
    }
}
