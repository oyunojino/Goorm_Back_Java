package Java_Basic_0914;

import javax.swing.*;

public class Basic_14_final {
    private static final int Max = 3;
    
    public static void main() {
        int num;
        for (int i = 0; i < Max; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("값 입력"));
            if(num > Max)
                System.out.println("3보다 크다.");
            else
                System.out.println("3보다 작다.");
        }
    }
}
