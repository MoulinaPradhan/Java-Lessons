package src.Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students:");
        int n = sc.nextInt();
        int marks[] = new int[n];

        for (int i = 1; i <= n; i++) {
            marks[i] = sc.nextInt();
        }
        int average = 0;
        for (int i = 0; i <= n; i++) {
            average += marks[i];
        }
        average /= n;
        System.out.println(average);
    }
}
