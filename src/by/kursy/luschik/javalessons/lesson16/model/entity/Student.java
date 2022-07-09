package by.kursy.luschik.javalessons.lesson16.model.entity;

public class Student {
    public String name;     //8
    public int age;         //4
    public double mark;     //8
    public char sex;        //2    // 'm' or 'f'
    public boolean alive;   //4


    // default constructor
    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
        sex = 'f';
    }

    // constructor with args (params)
    public Student(String name, int age, double mark, char sex, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;
    }

    // copy-constructor
//    public Student(Student student){
//        name=student.name;
//        age = student.age;
//        mark = student.mark;
//        sex = student.sex;
//        alive = student.alive;
//    }

    // copy-constructor
    public Student(Student student){
        this(student.name, student.age, student.mark, student.sex, student.alive);
    }

    public void testing(){
        System.out.println(this.hashCode());
    }

    // constructor with args (params)
    public Student(String name) {
        this.name = name;
    }

    // constructor with args (params)
    public Student(String name, int age, char sex, boolean alive) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.alive = alive;
    }

    // constructor with args (params)
    public Student(boolean alive) {
        this.alive = alive;
    }

// init blocks
    {
        mark =4.0;
    }

    public String getInfo() {
        return name + " { age = " + age
                + "; mark = " + mark
                + "; sex = " + (sex == 'm' ? "male" : "female")
                + "; alive = " + (alive ? "yes" : "no") + " }";
    }
}