package Java_Basic_0914;

class AccessEx {
    private int aa;
    public int bb;
    int cc;

    public void setAa(int aa) {this.aa = aa;}
    public void setBb(int bb) {this.bb = bb;}
    public void setCc(int cc) {this.cc = cc;}

    public void Disp() {
        System.out.println("aa 값 : " + aa + "\nbb 값 : " + bb +"\ncc 값 : " + cc);
    }
}
public class Basic_6_access {
    public static void main() {
        AccessEx obj = new AccessEx();
//        obj.aa = 10;    // private 이기 때문에 은 안됨
        obj.setAa(10);

        obj.bb = 20;
        obj.setBb(20);

        obj.cc = 50;
        obj.setCc(50);

        obj.Disp();
    }
}
