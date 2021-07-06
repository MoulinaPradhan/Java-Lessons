
import java.util.*;
/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
 */
public class ReverseVowels {
    class Solution {
        public String reverseVowels(String s) {
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');
            
            char[] chars = s.toCharArray();
            int i =0;
            int j=s.length()-1;
            
            while( i<j){
                while( i < j && !set.contains(chars[i])){
                    i++;
                }
                while( i < j && !set.contains(chars[j])){
                    j--;
                }
                char temp = chars[i];
                chars[i ++] = chars[j];
                chars[j --] = temp;
            }
            return new String (chars);
            
            
        }
    }
}
