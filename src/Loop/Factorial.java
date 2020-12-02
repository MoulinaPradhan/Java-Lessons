package src.Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            factorial = factorial * i;
        }
        System.out.println("the factorial is " + factorial);
    }
}