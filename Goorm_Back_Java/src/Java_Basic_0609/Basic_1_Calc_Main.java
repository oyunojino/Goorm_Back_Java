package Java_Basic_0609;

public class Basic_1_Calc_Main {

    public static int main() {
        int[] scores;
        scores = new int[]{83, 90, 87};

        Basic_2_Calc calc = new Basic_2_Calc();

        int sum1= 0;
        for (int i=0; i<3; i++) {
            sum1 += scores[i];
        }

        System.out.println("sum1 총합 : " + sum1);
        System.out.println("sum1 평균 : " + calc.avg(scores));

        int sum2 = calc.add(new int[] {83, 90, 87});
        int avg2 = calc.avg(new int[] {83, 90, 87});
        System.out.println("sum2 총합 : " + sum2);
        System.out.println("sum2 평균 : " + calc.avg(new int[] {83, 90, 87}));
        System.out.println();

        return sum1;
    }
}
