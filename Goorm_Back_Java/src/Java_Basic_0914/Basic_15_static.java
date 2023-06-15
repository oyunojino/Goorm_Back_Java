package Java_Basic_0914;

class StVal {
    int a;
    static int b;
}
public class Basic_15_static {
    public static void main() {
        StVal obj1 = new StVal();
        StVal obj2 = new StVal();

        obj1.a = 10;
        obj1.b = 20;

        // obj1 : a = 10, b = 20
        System.out.println("obj1 : a = " + obj1.a + ", b = " + obj1.b);

        obj2.a = 100;
        obj2.b = 200;

        // obj2 : a = 100, b = 200
        System.out.println("obj2 : a = " + obj2.a + ", b = " + obj2.b);
        // obj1 : a = 10, b = 200
        System.out.println("obj1 : a = " + obj1.a + ", b = " + obj1.b);
    }
}
