package Java_Basic_0609;

public class Basic_4_ArrayCopyByForExample {

    public static void main() {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
