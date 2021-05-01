package src.Stack;

import java.util.*;


public class ValidParenthesis {
public static void main(String[] args) {
    String s="([)]";
    System.out.println(isValid(s));
}   


public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']','[');
    
    for (Character c : s.toCharArray()) {
        if (!map.containsKey(c)) {
            stack.push(c);
        } else {
            if (stack.isEmpty() || stack.peek() != map.get(c)) return false;
            stack.pop();
        }
    }
    return stack.isEmpty();
}
}
