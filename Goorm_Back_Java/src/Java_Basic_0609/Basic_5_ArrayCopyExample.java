package Java_Basic_0609;

public class Basic_5_ArrayCopyExample {
    public static void main() {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
