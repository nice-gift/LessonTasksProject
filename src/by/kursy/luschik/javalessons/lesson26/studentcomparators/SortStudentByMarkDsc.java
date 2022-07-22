package by.kursy.luschik.javalessons.lesson26.studentcomparators;

import by.kursy.luschik.javalessons.lesson26.Student;

import java.util.Comparator;

public class SortStudentByMarkDsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o2.getMark()- o1.getMark();

        if (result == 0) {
            result = o2.getName().compareTo(o1.getName());
            if (result == 0) {
                result = o2.getAge() - o1.getAge();
            }
        }
        return result;
    }
}


