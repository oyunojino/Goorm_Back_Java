package Java_Basic_0914;

class Vegetable2 {
    String sort;
    String season;
    String name;
    public void Set1(String a, String b, String c) {
        sort = a; season = b; name = c;
    }
    public void Disp() {
        System.out.println("분류 : " + sort);
        System.out.println("계절 : " + season);
        System.out.println("이름 : " + name);
    }
}
class Paprika2 extends Vegetable2 {
    private String color;
    private int price;
    private String name;

    public void Set2(String a, int b, String c) {
        color = a; price = b; name = c;
    }
    public void Disp() {
        System.out.println("색상 : " + color);
        System.out.println("가격 : " + price);
        System.out.println("이름 : " + super.name);
    }
}
public class Basic_11_override {
    public static void main() {
        Paprika2 obj = new Paprika2();

        obj.Set1("피망류", "여름", "노란파프리카");
        obj.Set2("빨강", 2000, "빨간파프리카");
        obj.Disp();
        obj.Disp();
    }
}
