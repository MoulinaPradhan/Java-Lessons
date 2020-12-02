package src.Loop;

import java.util.Scanner;

public class LogarithimicSeries {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 1f;
        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1 / i;
                continue;
            } else {
                sum += 1 / i;
            }
        }
        System.out.println("the sum is " + sum);
    }

}
