package src.Strings;

/**
 * 796. Rotate String
Easy

948

55

Add to List

Share
We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false
 */

public class SameRotatingString {
    public static boolean rotateString(String A, String B) {
		// Check if the strings are of same length and
		// if they are of same length then check if A is a
		// substring of B concatenated with B
		// Eg -> A = abc, B = cab
		// On concatenating B twice we get : cabcab which contains the string A
		// from index 1 to 3
        return A.length() == B.length() && (B + B).contains(A);
    }
    public static void main(String[] args) {
        String A="abcde";
        String B="bcdea";
        System.out.println(rotateString(A, B)); 
//    System.out.println(B+B);
    }
}
