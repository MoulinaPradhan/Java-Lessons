
import java.util.*;

public class Phone {
   //! stores the answers generated in the recursion
   static ArrayList<String> ans;
   //! stores each number to its list of keys
   static HashMap<Character, List<Character>> map = new HashMap<>();
   //! recursive function
   public static void getLetterCombination(String digits,String answer){
       //! recursion base
       if(digits.isEmpty()){
           if(!answer.isEmpty())ans.add(answer);
           return ;

       }
       /*
       * 1. gets the first character of the digits string 
       * 2. add all it's possible number variants to answer..
       * 3. calls another function removing the already processed part of <digits/> which was at pos 0
       * Example :::
       *                     getLetterCombination("23","")
       *                           /          |                \
       * getLetterCombination("3","a")     getLet..("3","b")  getLet..("3","c")
       *           ...                     /       |          \       ...
       *                   getLet..("","bd") getLet..("","be") getLet("","bf")
       *   
       */
       Character x = digits.charAt(0);
       for(Character y: map.get(x)){
           getLetterCombination(digits.substring(1), answer+y);
       }
   }
   public  static List<String> letterCombinations(String digits) {
      map.put('2',Arrays.asList('a','b','c'));
       map.put('3',Arrays.asList('d','e','f'));
       map.put('4',Arrays.asList('g','h','i'));
       map.put('5',Arrays.asList('j','k','l'));
       map.put('6',Arrays.asList('m','n','o'));
       map.put('7',Arrays.asList('p','q','r','s'));
       map.put('8',Arrays.asList('t','u','v'));
       map.put('9',Arrays.asList('w','x','y','z'));
       ans = new ArrayList<>();
       getLetterCombination(digits,"");
       return ans;
   }
public static void main(String[] args) {
    String digits="23";
    System.out.println(letterCombinations(digits));
}
}   

