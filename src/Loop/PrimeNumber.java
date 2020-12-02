package src.Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = n % i;
            if (result == 0) {
                System.out.println("not a prime number");
                break;
            } else {
                System.out.println("prime");
                break;
            }
        }
        if (n == 2)
            System.out.println("its a prime");
        else if (n == 1)
            System.out.println("neither prime neither composite");
    }

}
