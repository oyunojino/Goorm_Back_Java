package Java_Basic_0914;

public class Basic_8_overloading {
    private int nai;
    private float ki;
    private String name;
    public Basic_8_overloading() {
        // 생성자
        nai = 0;
        ki = 0;
        name = "익명1";
    }
    public Basic_8_overloading(int a, float b) {
        // 생성자
        nai = a;
        ki = b;
        name = "익명2";
    }
    public Basic_8_overloading(int a, float b, String c) {
        // 생성자
        nai = a;
        ki = b;
        name = c;
    }
    public void Disp() {
        System.out.println("나이는 " + nai + "입니다.");
        System.out.println("키는 " + ki + "입니다.");
        System.out.println("이름은 " + name + "입니다.\n");
    }
    public static void main() {
        Basic_8_overloading obj = new Basic_8_overloading(20, 170);
        obj.Disp();
        Basic_8_overloading obj2 = new Basic_8_overloading(20, 170, "홍길동");
        obj2.Disp();

    }
}
