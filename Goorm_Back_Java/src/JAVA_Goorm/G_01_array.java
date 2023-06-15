package JAVA_Goorm;

public class G_01_array {

    public static void main1() {
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++) {
                System.out.println("mathScores["+i+"]["+k+"]="
                        +mathScores[i][k]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for(int i=0; i<englishScores.length; i++) {
            for(int k=0; k<englishScores[i].length; k++) {
                System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores = { {95, 80}, {92, 96, 80} };
        for(int i=0; i<javaScores.length; i++) {
            for(int k=0; k<javaScores[i].length; k++) {
                System.out.println("javaScores["+i+"]["+k+"]="
                        +javaScores[i][k]);
            }
        }
    }

    public static void main2() {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        System.out.println( strArray[0] == strArray[1]);
        System.out.println( strArray[0] == strArray[2] );
        System.out.println( strArray[0].equals(strArray[2]) );
    }

    public static void main3() {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }

    public static void main4() {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }

}
