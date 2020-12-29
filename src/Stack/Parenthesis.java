package src.Stack;

import java.util.*;


class Solution {
    public String removeOuterParentheses(String S) {
        int open = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : S.toCharArray()){
            if(ch == '('){
                if(open!=0){
                    sb.append(ch);
                }
                open++;
            }else if(ch == ')'){
                open--;
                if(open!=0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
