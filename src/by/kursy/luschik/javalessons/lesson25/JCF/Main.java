package by.kursy.luschik.javalessons.lesson25.JCF;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomCollection collection = new CustomCollection(new TreeSet<>());
        collection.add(10);
        collection.add(11);
        collection.add(220);
        collection.add(2);

        System.out.println(collection);
        System.out.println("result="+justDoIt(collection));
    }

    public static int justDoIt(CustomCollection collection) {
        int sum = 0;

        for (int element : collection) {
            sum += element;
        }
        return sum;
    }

//        ArrayList list = new ArrayList<>();
//        LinkedList list = new LinkedList<>();
//        HashSet list = new HashSet<>();
//        PriorityQueue list = new PriorityQueue<>();
//
//        list.add(12);
//        list.add(6);
//        list.add(125);
//        list.add(10);
//        list.add(45);
//        list.add(45);
//
//        test(list);
//    }

    public static void test(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
