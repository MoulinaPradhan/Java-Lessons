package src.HashMaps;
import java.util.*;
/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0
 */
public class Ballons {
  public static void main(String[] args) {
    String text="nlaebolko";

    int[] arr = new int[26];
    for(char i : text.toCharArray()){
        arr[i-'a']++;
    }
    char[] bal = {'b','a','l','o','n'};
    int minCount = Integer.MAX_VALUE;
    int j =0;
    
    for(char i : bal){
        int count = arr[i-'a'];
        if(i=='l' || i=='o')count=count/2;
        minCount = Math.min(count,minCount);
    }
   System.out.println(minCount);
  }  
}
