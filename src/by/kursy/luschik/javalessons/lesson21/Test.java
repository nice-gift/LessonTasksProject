package by.kursy.luschik.javalessons.lesson21;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        IA a = worker;
        a.test();

        IB b = worker;
        b.test();

        IC c = worker;
        b.test();
    }
}
