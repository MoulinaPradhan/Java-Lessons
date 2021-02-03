package src.Strings;


import java.util.*;

public class RemoveAlladjacent {
    public static void main(String[] args) {
        String S = "abbaca";
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(!stack.isEmpty() && stack.peek()==S.charAt(i)) {
                stack.pop();
            }
            else{
                stack.push(S.charAt(i));
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
       System.out.println( sb.reverse().toString());
    }
}
