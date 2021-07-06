

import java.util.*;

public class CharDifference {
    
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
       


    }
    public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        Map<Character,Integer> map = new HashMap();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    map.put(ch,map.get(ch)-1);
                }
                else{
                    return ch;
                }
            }
            else{
                return ch;
            }
        }
        return ' ';
    }
}
