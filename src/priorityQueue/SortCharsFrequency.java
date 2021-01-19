package src.priorityQueue;
import java.util.*;


public class SortCharsFrequency {
    public static void main(String[] args) {
        String s="tree";
        Map<Character,Integer> map = new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int of= map.get(ch);
                int nf= of+1;
                map.put(ch,nf);
            }
            else{
                map.put(ch,1);
            }
            }
    //   System.out.println("hola");
    //   System.out.println(map);
    //   System.out.println(map.values());

      PriorityQueue <Character> pq= new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

      pq.addAll(map.keySet());

      StringBuilder sb = new StringBuilder();
 
      while(!pq.isEmpty()) {
        char c = pq.remove();

        for(int i = 0; i < map.get(c); i++) {
            sb.append(c);
         }
     }

     String g= sb.toString();
     System.out.println(g);
 }


}

