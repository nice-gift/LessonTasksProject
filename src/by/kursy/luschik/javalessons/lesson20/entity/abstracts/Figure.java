package by.kursy.luschik.javalessons.lesson20.entity.abstracts;

public abstract class Figure {
    protected int x;
    protected int y;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Figure figure = (Figure) obj;
        return (x == figure.x && y == figure.y);
//        } else {
//            return false;
    }

    public Figure() {
        x = 0;
        y = 0;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();

    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

}
