package src.LeetCode;

import java.util.*;

public class ConsecutiveChars {
    public static void main(String[] args) {
        String s ="abbcccddddeeeeedcba";
       
    Stack<Character> stack = new Stack<>();
    stack.push(s.charAt(0)); 
    int count = 1; 
    int i = 1; 
    int max = 1; 
	
    while(i<s.length()){
        if(stack.size()>0 && s.charAt(i)==stack.peek()){
            count++;   
            max = Math.max(max, count);
			
        }else{
		
            count = 1; 
			
        }
        stack.push(s.charAt(i)); 
        i++;
    }
	
   System.out.println(max);
	
    }
}
