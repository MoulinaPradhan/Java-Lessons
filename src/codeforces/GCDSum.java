package src.codeforces;

import java.util.*;

public class GCDSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
           
            System.out.println(gcdsum(n));
        }
    }
    public static int gcdsum(int n){
        int sum = 0, m=0;
        int pre =1;
        while(n > 0){
            
            m = n%10;
            sum = sum +m;
            n = n/10;
           
        }
        System.out.println(sum+"sum");
        int gcd = 1;

        for (int i = 1; i <= n && i <= sum; ++i) {
    
         if (n % i == 0 && sum % i == 0)
            gcd = i;
        }
    
      return Math.max(gcd,pre);
    }
}
