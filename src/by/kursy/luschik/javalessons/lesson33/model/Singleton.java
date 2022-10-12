package by.kursy.luschik.javalessons.lesson33.model;

public enum Singleton {
    INSTANCE(10);

    private int number;

    private Singleton() {
    }

    private Singleton(int number) {
        this.number = number;
    }
}
