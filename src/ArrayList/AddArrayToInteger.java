package src.ArrayList;
import java.util.*;
import java. math. *;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 
 */

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 */
public class AddArrayToInteger {
    public static void main(String[] args) {
        int  A[] = {9,9,9,9,9,9,9,9,9,9}, K = 1;

    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
             ++digits[i];
             if(digits[i] < 10)
                 break;
             else {
                 digits[i] = 0;
                 if(i == 0) {
                     int[] arr = new int[digits.length + 1];
                     arr[0] = 1;
                     return arr;
                 }
             }
         }
         return digits;
     }
}
