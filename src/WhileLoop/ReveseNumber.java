package src.WhileLoop;

import java.util.Scanner;

public class ReveseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverseNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(reverseNumber);
    }

}
