package src.HashMaps;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeek";

        Map<Character,Integer> real = new HashMap<>();
        Map<Character,Integer> res= new HashMap<>();
       int i=0;
       int j=0;

       boolean flag = false;

       
        while(i<a.length()){
            if(real.containsKey(a.charAt(i))){
                int of= real.get(a.charAt(i));
             real.put(a.charAt(i), of+1);
             i++;
            }else{
                real.put(a.charAt(i), 1);
                i++;
            }
        }
 
        while(j<b.length()){
         if(res.containsKey(b.charAt(j))){
             int of= res.get(b.charAt(j));
          res.put(b.charAt(j), of+1);
          j++;
         }else{
             res.put(b.charAt(j), 1);
             j++;
         }
     }
       
     
      if(res.equals(real)){
          flag = true;
      }else{
          flag=false;
      }



    System.out.println(real);
    System.out.println(res);
    System.out.println(flag);



    }
}
