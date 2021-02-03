package src.LeetCode;
import java.util.*;

/**
 * Given a sentence text (A sentence is a string of space-separated words) in the following format:

First letter is in upper case.
Each word in text are separated by a single space.
Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.

Return the new text following the format shown above.

 

Example 1:

Input: text = "Leetcode is cool"
Output: "Is cool leetcode"
Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
Output is ordered by length and the new first word starts with capital letter.
Example 2:

Input: text = "Keep calm and code on"
Output: "On and keep calm code"
Explanation: Output is ordered as follows:
"On" 2 letters.
"and" 3 letters.
"keep" 4 letters in case of tie order by position in original text.
"calm" 4 letters.
"code" 4 letters.
Example 3:

Input: text = "To be or not to be"
Output: "To be or to be not"

 */

public class RearrangeWordsInSentence {
    public static void main(String[] args) {
        
    }
    public String arrangeWords(String text) {

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        List<String> strList = new ArrayList<>();
        
        String[]  array = text.split(" ");    // Split sentence into words
        
        String smallCase = array[0].substring(0,1).toLowerCase() + array[0].substring(1);   //convert 1st letter of 1st word in small letter.
        array[0] = smallCase;
        
        for(String s : array) {
            hm.put(s, s.length());     // add words and their length in map.
            strList.add(s);                // add words in list to sort
        } 
        
        Collections.sort(strList, (a,b)->hm.get(a) - hm.get(b));   // sort the list
        
        String retString = strList.get(0);
        String capString = retString.substring(0,1).toUpperCase() + retString.substring(1);  // convert 1st letter of the 1st sorted word in caps.
        
        for(int i = 1; i < strList.size(); i++){            
            capString = capString + " " + strList.get(i);               // Create the sentence.
        }        
        return capString;
    }
}
