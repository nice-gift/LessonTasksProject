package by.kursy.luschik.javalessons.lesson26;

import by.kursy.luschik.javalessons.lesson26.studentcomparators.SortStudentByAgeAsc;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int bound = 20;

//        Set<Integer> set = HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        TreeSet<Integer> set = new TreeSet<>();


//        Queue queue=new LinkedList();
        Queue queue=new PriorityQueue();

        for (int i = 0; i < size; i++) {
            int number = random.nextInt(bound);
            queue.offer(number);
            System.out.print(number + " ");
        }
        System.out.println();

        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }

//        System.out.println();
//        System.out.println(queue);


//        Set<Student> set = new TreeSet<>(new SortStudentByAgeAsc());
//        set.add(new Student("Alex", 20 , 4));
//        set.add(new Student("Alex", 21 , 10));
//        set.add(new Student("Alex", 17 , 8));
//        set.add(new Student("Alex", 23 , 10));
//        set.add(new Student("Alex", 20 , 10));
//        view(set);


    }



    public static void view(Iterable<Student>iterable) {
        for (Student st:iterable
             ) {
            System.out.println(st);

        }
    }
}
