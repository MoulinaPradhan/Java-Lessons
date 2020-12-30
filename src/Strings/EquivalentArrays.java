package src.Strings;

import java.util.*;

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.
 
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

*/


public class EquivalentArrays {
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String[] word1={"ab", "c"};
      String [] word2={"a","bc"};
      
      String joined1 = String.join("",word1);
      String joined2 = String.join("",word2);
      System.out.println(joined1.equals(joined2));
 
  }
    





}
