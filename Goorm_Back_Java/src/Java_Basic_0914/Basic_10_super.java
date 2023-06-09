package Java_Basic_0914;

class Vegetable {
    String sort;
    String season;
    String name;
    public void Set1(String a, String b, String c) {
        sort = a; season = b; name = c;
    }
    public void Disp1() {
        System.out.println("분류 : " + sort);
        System.out.println("계절 : " + season);
        System.out.println("이름 : " + name);
    }
}
class Paprika extends Vegetable {
    private String color;
    private int price;
    private String name;

    public void Set3(String a, int b, String c) {
        color = a; price = b; name = c;
    }
    public void Disp2() {
        System.out.println("분류 : " + sort);
        System.out.println("계절 : " + season);
        System.out.println("이름 : " + super.name);
    }
    public void Disp3() {
        System.out.println("색상 : " + color);
        System.out.println("가격 : " + price);
        System.out.println("이름 : " + name);
    }
}
public class Basic_10_super {
    public static void main() {
        Paprika obj = new Paprika();

        obj.Set1("피망류", "여름", "노란파프리카");
        obj.Set3("빨강", 2000, "빨간파프리카");
        obj.Disp1();
        obj.Disp2();
        obj.Disp3();
    }
}
