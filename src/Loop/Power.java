package src.Loop;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the power");
        int b = sc.nextInt();
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
    }

}
