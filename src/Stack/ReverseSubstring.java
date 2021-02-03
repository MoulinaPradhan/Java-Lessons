package src.Stack;
import java.util.*;

/***
 * You are given a string s that consists of lower case English letters and brackets. 

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.

 

Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
Example 4:

Input: s = "a(bcdefghijkl(mno)p)q"
Output: "apmnolkjihgfedcbq"
 

 */

public class ReverseSubstring {
   public static void main(String[] args) {
       String s="(abcd)";

       Stack <Character> st = new Stack<>();
       StringBuilder sb = new StringBuilder();
       String res="";
       for(int i=0;i<s.length();i++){
          if(s.charAt(i) == ')'){
             while( !st.empty() && st.peek() != '('){
                sb.append(st.pop());
             }
             st.pop();
             for(int j=0; j<sb.length() ; j++){
                st.push(sb.charAt(j));
             }
             res = sb.toString();
             sb.setLength(0);
          }else{
             st.push(s.charAt(i));
          }

       }
       if(!st.empty()){
          while(!st.isEmpty()){
             sb.append(st.pop());
          }
          res= sb.reverse().toString();
       }
    

      
   System.out.println(res);
}
}