package src.LeetCode;

import java.util.*;

public class HappyNumber {
    public static boolean isHappy(int n) {
        for(int i=0; i<13; i++){
            n = newfunc(n);
        }
        
        if(n == 1){
            return true;
        } else {
            return false;
        }
    }

 public static int newfunc(int n){
    int sum=0;
    while(n>0){
        int last =n%10;
          sum +=last*last;
          n=n/10;
         System.out.println( sum);
         
     }
     return sum;
    }
 
    
    public static void main(String[] args) {
        int n=13;
        System.out.println(isHappy(n));
    }
}
