package by.kursy.luschik.javalessons.lesson31;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.number = 2;
        b.value = 1.8;
        b.name = "name";
        b.flag = true;
        b.field = 4;

        Serializer.serializer(b);
        System.out.println(Serializer.deserializer());
    }
}
