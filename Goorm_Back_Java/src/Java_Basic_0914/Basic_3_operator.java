package Java_Basic_0914;

public class Basic_3_operator {
    public static void main() {
        int a=10, b=20, c=3;
        System.out.println("a++ : " + (a++));   // 10
        System.out.println("++a : " + (++a));   // 12
        System.out.println("a++ : " + (a++));   // 12
        System.out.println("c++ : " + (c++));   // 3
        System.out.println("(++a) + (b++) : " + ((++a) + (b++)));   // 34
    }
}
