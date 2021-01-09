package src.Strings;
import java.util.*;

/**
 * Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same, where in each step you can delete one character in either string.

Example 1:
Input: "sea", "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

*/
public class TwoSameStrings {

    public static void main(String[] args) {
        String word1 ="b";
        String word2 = "";

       int l= Math.max(word1.length() ,word2.length());
int count=0;
        for(int i=0;i<l;i++){
            if(word1.contains(word2) || word2.contains(word1)){ 
                count=0;
        }
     if(word1 =="" && word2.length()>0 || word2 == "" && word1.length()>0){
        count=0;
        // System.out.println(count);
        break;
     }  

      if(word1.contains(Character.toString((word2.charAt(i))))){
                count=count+1;
            }
        }
        int w1=word1.length()-count;
        int w2= word2.length()-count;
        int total=w1+w2;
        // System.out.println(count);
        System.out.println(total);
    }
}
