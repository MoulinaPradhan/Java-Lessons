import java.util.*;

public class slot1 {
    public static void main(String[] args) {
        String ip = "999  aa 22aa";
        ip= ip.replace(" ", "$");
        // System.out.println(ip);
        Map<Character,Integer> digit = new HashMap<>();
        Map<Character,Integer> chars = new HashMap<>();
        for(int i=0;i<ip.length();i++){
         char s = ip.charAt(i);
         if(Character.isDigit(s)){
           digit.put(s,digit.getOrDefault(s,0)+1);
         }
         else if(Character.isAlphabetic(s)){
            chars.put(s,chars.getOrDefault(s,0)+1);
         }
        
        }

        // System.out.println(digit);
        // System.out.println(chars);

       char maxD=1;int max=0;
        for(Map.Entry<Character,Integer> entry :digit.entrySet()){
        if(max < entry.getValue()){
        max =entry.getValue();
        maxD = entry.getKey();
 }
        }
        int d= max;
        max =0;char maxA=1;
        for(Map.Entry<Character,Integer> entry :chars.entrySet()){
            if(max < entry.getValue()){
            max =entry.getValue();
            maxA= entry.getKey();
     }
            }
        

char sp= ip.charAt(Math.abs(d-max));
if(sp!='$')
ip = ip.replace(String.valueOf(sp),"");
System.out.println(ip);

    }
}
