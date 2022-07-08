package by.kursy.luschik.javalessons.question;

public class Flower {
    private String name;
    private String color;
    private double price;
    private double weight;
    private int length;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.weight, weight) != 0) return false;
        if (price != flower.price) return false;
        if (length != flower.length) return false;
        if (!name.equals(flower.name)) return false;
        return color.equals(flower.color);
    }
}
