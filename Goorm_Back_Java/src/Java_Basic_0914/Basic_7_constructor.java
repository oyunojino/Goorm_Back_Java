package Java_Basic_0914;

public class Basic_7_constructor {
    private int aa;
    private int bb;
    public Basic_7_constructor(int a, int b) {
        // # 생성자 : 클래스와 이름을 똑같이 작성
        aa = a;
        bb = b;
    }
    public static void main() {
        Basic_7_constructor obj = new Basic_7_constructor(10, 20);
        System.out.println(obj.aa);
        System.out.println(obj.bb);
    }
}
