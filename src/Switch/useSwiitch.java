package src.Switch;

import java.util.Scanner;

public class useSwiitch {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Its one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid");
        }

    }
}