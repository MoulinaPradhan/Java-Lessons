package src.Stack;
import java.util.*;


/**
 * Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent
 */

public class MakeStringsGreater {
    public static void main(String[] args) {
        System.out.println(makeGood("LeeEetcode"));
        System.out.println(makeGood("S"));
        makeGood("goluPioli");
    }
    public static String makeGood(String s) {
        
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && (stack.peek()==s.charAt(i)+32 || stack.peek()==s.charAt(i)-32)){ //for both change to upper case to lower case and vice versa
                stack.pop();  
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        char[] c=new char[stack.size()];
        for(int i=c.length-1;i>=0;i--){
            c[i]=stack.pop();
        }
        return new String(c);
    }
}
