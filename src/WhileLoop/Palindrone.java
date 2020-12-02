package src.WhileLoop;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverseNumber = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }
        if (reverseNumber == n)
            System.out.println("number is palindrome");
        else
            System.out.println("not palindrone");
    }
}
