package by.kursy.luschik.javalessons.lesson19;

//class Test {
//    int a, b;
//
//    Test(int i, int j) {
//        a = i;
//        b = j;
//    }
//
//    void meth(Test ob) {
//        ob.a *= 2;
//        ob.b /= 2;
//    }
//}

public class Rec {
    public static void main(String[] args) {
//        Test ob = new Test(10, 30);
//        System.out.println("ob.a and ob.b before: " + ob.a + ob.b);
//
//        ob.meth(ob);
//        System.out.println("ob.a and ob.b after: " + ob.a + ob.b);

        String str1 = "keks";
        String str2= str1;
        if (str2.equals(str1)) {
            System.out.println("str2 equals str1");
        }
        System.out.println(str1.charAt(0));
        System.out.println(str1.toUpperCase());
    }
}
