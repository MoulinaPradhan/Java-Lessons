package src.Strings;
import java.util.*;


/**
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
 */


public class HalfStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
    System.out.println(halvesAreAlike(s));
    }


    public static boolean halvesAreAlike(String s) {
       String first = s.substring(0,s.length()/2);   //takes up from the first because of 0
        String last = s.substring(s.length()/2);    //takes from last 
        System.out.println(first);
        System.out.println(last);
int firstVowel=0,lastVowel=0;

        for(int i=0;i<s.length()/2;i++){
            if("AEIOUaeiou".indexOf(first.charAt(i)) >=0){
                firstVowel++;
            }
            if("AEIOUaeiou".indexOf(last.charAt(i))  >=0){
                lastVowel++;
            }
        }
        return firstVowel == lastVowel;
           
    }












}
