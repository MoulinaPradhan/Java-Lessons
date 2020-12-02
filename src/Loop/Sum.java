package src.Loop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("****");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            // System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}