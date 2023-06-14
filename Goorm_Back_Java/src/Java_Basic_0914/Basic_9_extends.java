package Java_Basic_0914;

class Fruit {
    private String sort;
    private String season;
    
    public void Set1(String a, String b) {
        sort = a;
        season = b;
    }
    public void Disp1() {
        System.out.println("분류 : " + sort);
        System.out.println("계절 : " + season);
    }
}
class Berry extends Fruit {
    private String size;
    private String name;

    public void Set2(String a, String b) {
        size = a;
        name = b;
    }
    public void Disp2() {
        System.out.println("크기 : " + size);
    }
}
class StrawBerry extends Berry {
    private String color;
    private  int price;

    public void Set3(String a, int b) {
        color=a;
        price=b;
    }
    public void Disp3() {
        System.out.println("색상 : " + color);
        System.out.println("가격 : " + price);
    }
}
public class Basic_9_extends {
    public static void main() {
        StrawBerry obj = new StrawBerry();

        obj.Set1("Berry류", "여름");
        obj.Set2("딸기", "소");
        obj.Set3("빨강", 5000);

        obj.Disp1();
        obj.Disp2();
        obj.Disp3();
    }
}
