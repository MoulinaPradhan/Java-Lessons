// https://leetcode.com/problems/generate-parentheses/submissions/


package StringQuestions;
import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    static List<String> list = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
       fn("", n, n);
       return list;

    }
    public static void fn(String present,int left, int right){
        if(right ==0){
            list.add(present);
            return;
        }
        if(left >0){
            fn(present+'(', left-1, right);
        }
 if(left < right){
            fn(present+')', left, right-1);
        }
    }
}