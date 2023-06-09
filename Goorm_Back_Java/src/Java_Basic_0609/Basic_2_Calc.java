package Java_Basic_0609;

public class Basic_2_Calc {
    public static int add(int[] scores) {
        int sum=0;
        for (int i=0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static int avg(int[] scores) {
        int avg=0, sum=0;
        int count = scores.length;
        for (int i=0; i<3; i++) {
            sum += scores[i];
        }
        avg = sum / count;

        return avg;
    }
}
