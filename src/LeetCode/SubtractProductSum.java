package src.LeetCode;

/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

 */

import java.util.*;

public class SubtractProductSum {
    public static int subtractProductAndSum(int n) {
   int sum=0,multiply=1;
   while(n!=0){
       sum=sum+n%10;
       multiply=multiply*(n%10);
       n=n/10;
   }
  
   int product=multiply-sum;
        
  return product;
    }
    public static void main(String[] args) {
        int n=4421;
        System.out.println(subtractProductAndSum(n));
    }   
}
