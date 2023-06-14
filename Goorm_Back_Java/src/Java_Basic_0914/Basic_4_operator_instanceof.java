package Java_Basic_0914;


class clsA {
    void func() {
        System.out.println("HELLO");
    }
}
class clsB extends clsA {

}

public class Basic_4_operator_instanceof {
    public static void main() {
        clsB objB = new clsB();

        if(objB instanceof clsA) {
            System.out.println("YES clsA");
        }
        if(objB instanceof clsB) {
            System.out.println("YES clsB");
        }
    }
    // 둘다 출력
}
