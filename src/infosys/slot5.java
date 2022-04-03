import java.io.*;
import java.util.*;

public class slot5 {
    public static void main(String[] args) throws java.lang.Exception {
     
            Scanner in = new Scanner(System.in);
    
            String s = in.nextLine();
            String words[] = in.nextLine().split(",");
    
            HashSet<Character> st = new HashSet<>();
    
            String ans = "";
    
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!st.isEmpty() && st.contains(c))  continue;
                st.add(c);
                if(isUnique(words[i], c, i, words, s)) {
                    ans += c;
                }
            }   
    
            if(ans.isEmpty()) {
                System.out.println("NA");
            }
            else {
                System.out.println(ans);
            }
    
            in.close();
        }
    
        static boolean isUnique(String word, char c, int pos, String[] words, String inStr) {
            for(int i = 0; i < words.length; i++) {
                if(i == pos)    continue;
                if((words[i].equals(word) && inStr.charAt(i) != c) || (inStr.charAt(i) == c && !words[i].equals(word))) {
                    return false;
                }
            }
            return true;
        }
    
    }
