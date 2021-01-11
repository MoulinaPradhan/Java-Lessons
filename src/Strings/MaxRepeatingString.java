package src.Strings;

import java.util.*;

public class MaxRepeatingString {
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        
        StringBuilder temp = new StringBuilder(word);
        while(sequence.indexOf(temp.toString())!=-1){
            count++;
            temp.append(word);
        }
        
        return count;
    }
    public static void main(String[] args) {
      String  sequence = "ababc", word = "ab";
      System.out.println(maxRepeating(sequence,word));  
    }  
}
