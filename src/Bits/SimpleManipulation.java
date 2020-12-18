package src.Bits;

import java.util.Scanner;

public class SimpleManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int om=0x55555555;
        int em=0xAAAAAAAA;
        int odds=om&n;
        int evens=em&n;
        odds<<=1;
        evens>>=1;
        n=odds|evens;
        System.out.println(n);
    }
}
