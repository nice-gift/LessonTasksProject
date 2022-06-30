package by.kursy.luschik.javalessons.question;

public class Chamomile extends Flower {
    private int numOfLeaves;

    @Override
    public boolean equals(Object o) {

//      Можно ли опустить следующие 2 строчки, они же проверяются у родителя?
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        if (!super.equals(o)) return false;

        Chamomile chamomile = (Chamomile) o;

        return numOfLeaves == chamomile.numOfLeaves;
    }
}
