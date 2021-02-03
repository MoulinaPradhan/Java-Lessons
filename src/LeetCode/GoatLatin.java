package src.LeetCode;
import java.util.*;
/**
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 
 */

public class GoatLatin {
    public static void main(String[] args) {
        String S ="I speak Goat Latin";
        
        System.out.println(toGoatLatin(S));

    }
    public static String toGoatLatin(String S) {
        StringBuilder ans = new StringBuilder();
        int count=0;
        String[] str = S.split(" ");
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
         hs.add('e');
         hs.add('i');
         hs.add('o');
         hs.add('u');
        hs.add('A');
         hs.add('E');
         hs.add('I');
         hs.add('O');
         hs.add('U');
        
        for(int  i=0;i<str.length;i++)
        {
            //StringBuilder temp = new StringBuilder();
         if(hs.contains(str[i].charAt(0)))
         {
             ans.append(str[i]);
             ans.append("ma");
             for(int j=0;j<=i;j++)
             {
                 ans.append('a');
             }
             if(i!=str.length-1)
             {
             ans.append(" ");
             }
        }
            else
            {
                ans.append(str[i].substring(1,str[i].length()));
                ans.append(str[i].charAt(0));
                ans.append("ma");
             for(int j=0;j<=i;j++)
             {
                 ans.append('a');
             }
                if(i!=str.length-1)
             ans.append(" ");
                
            }
            
        }
        return ans.toString();
    }
}
