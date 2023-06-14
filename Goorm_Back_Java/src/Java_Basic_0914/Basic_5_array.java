package Java_Basic_0914;

import javax.swing.*;

public class Basic_5_array {
    public static void main() {
        String str[] = {"a", "b", "c", "d", "e"};
        String res = "";
        for(int i = 0; i<str.length; i++) {
            res = res+str[i] + "\n";
        }
        System.out.println(res);
//        JOptionPane.showMessageDialog(null, "배열원소의 값" + res);

        int A[][] = {{10,20,30}, {40,50,50}};

        for(int i=0; i < A.length; i++) {
            for(int j=0; j < A[1].length; j++) {
                System.out.println(A[i][j]);
            }
        }
    }
}
