package by.kursy.luschik.javalessons.question;

public class Chamomile extends Flower {
    private int numOfLeaves;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

//      Можно ли опустить следующую строчку, она же проверяется у родителя?
        if (o == null || getClass() != o.getClass()) return false;


        if (!super.equals(o)) return false;

        Chamomile chamomile = (Chamomile) o;

        return numOfLeaves == chamomile.numOfLeaves;
    }
}
