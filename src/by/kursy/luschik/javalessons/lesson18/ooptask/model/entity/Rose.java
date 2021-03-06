package by.kursy.luschik.javalessons.lesson18.ooptask.model.entity;

public class Rose extends Flower {
    private double lengthOfThorn;
    private int numOfLeaves;

    public Rose() {
    }

    public Rose(double lengthOfThorn, int numOfLeaves) {
        this.lengthOfThorn = lengthOfThorn;
        this.numOfLeaves = numOfLeaves;
    }

    public Rose(String name, String color, double price, double weight,
                int length, double lengthOfThorn, int numOfLeaves) {
        super(name, color, price, weight, length);
        this.lengthOfThorn = lengthOfThorn;
        this.numOfLeaves = numOfLeaves;
    }

    public Rose(Rose rose) {
        this(rose.getName(), rose.getColor(), rose.getPrice(), rose.getWeight(),
                rose.getLength(), rose.lengthOfThorn, rose.numOfLeaves);
    }

    public double getLengthOfThorn() {
        return lengthOfThorn;
    }

    public void setLengthOfThorn(double lengthOfThorn) {
        if (lengthOfThorn >= 0 && lengthOfThorn <=getLength()) {
            this.lengthOfThorn = lengthOfThorn;
        }
    }

    public int getNumOfLeaves() {
        return numOfLeaves;
    }

    public void setNumOfLeaves(int numOfLeaves) {
        if (numOfLeaves >= 0 && numOfLeaves <= 20) {
            this.numOfLeaves = numOfLeaves;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", lengthOfThorn = " + lengthOfThorn +
                ", numOfLeaves = " + numOfLeaves;
    }
}
