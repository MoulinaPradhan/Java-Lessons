package src.Bits;

import java.util.Scanner;

public class LargestPwer2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

System.out.println(largestPowerOf2(n));
    }
    public static int largestPowerOf2(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
     return x-1;
    }
}
