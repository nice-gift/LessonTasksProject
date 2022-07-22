package by.kursy.luschik.javalessons.lesson27;

public class Test {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int index = 10;
//
//        try {
//            System.out.println(array[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error \n" + e);
//        }

        A a = new A();
//        try {
//            B b = (B) a;
//        } catch (ClassCastException e) {
//            System.out.println(e);
//        }
        if(a instanceof B) {
            B b = (B) a;
        } else  {
            System.out.println("Error");
        }
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

class D {
}
