package Java_Basic_0914;

abstract class Abstr {
    public String fun() {
        return "추상 클래스입니다.";
    }
    abstract public String Disp();
}
public class Basic_13_abstract extends Abstr {
    public String Disp() {
        return "오버라이딩 메소드입니다.";
    }
    public static void main() {
        Abstr obj = new Basic_13_abstract();
        System.out.println(obj.fun());
        System.out.println(obj.Disp());
    }
}
