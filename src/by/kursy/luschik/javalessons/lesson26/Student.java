package by.kursy.luschik.javalessons.lesson26;

import by.kursy.luschik.javalessons.lesson19.MarksNote;

public class Student implements Comparable<Student> {

    private String name;
    public int age;
    private int mark;

    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals of" + name);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (mark != student.mark) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode of" + name);
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + mark;
        return result;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + ": age = " + age + ", mark = " + mark;
    }

    @Override
    public int compareTo(Student o) {
//        sort student by name
//        int result = name.compareTo(o.name);
//
//        if (result == 0) {
//            result = age - o.age;
//            if (result == 0) {
//                result = mark - o.mark;
//            }
//        }
//        return result;

//        sort student by mark asc
        int result = o.mark-mark;

        if (result == 0) {
            result = name.compareTo(o.name);
            if (result == 0) {
                result = o.age - age;
            }
        }
        return result;


//        int result = 0;
//        if (age > o.age) {
//            result = 1;
//        } else if (age < o.age) {
//            result = -1;
//        }
//        return result;
    }
}
