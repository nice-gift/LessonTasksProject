package by.kursy.luschik.javalessons.lesson35;

public class Main1 {
    public static void main(String[] args) {
        Market1 market1 = new Market1();
        new Producer1(market1);
        new Consumer1(market1);
    }
}
