package src.Loop;

import java.util.Scanner;

public class SeriesSum {

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0f;
        for (float i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        System.out.println("hence the sum is " + sum);
    }
}