package src.HashMaps;

import java.util.*;

// All the functions like put,get,containsKey,keySet all are in O(1).

public class Basics {
  public static void main(String[] args) {
      HashMap<String, Integer> hm= new HashMap<>();
  
      hm.put("India", 123);
      hm.put("China", 193);
      hm.put("Pakistan", 23);
      hm.put("Bangladesh", 103);

      System.out.println(hm);
  
      hm.put("Nigeria", 70);
      hm.put("US", 50);

  System.out.println(hm);
  System.out.println(hm.get("India"));
  System.out.println(hm.get("UK"));

  System.out.println(hm.containsKey("UK"));
  System.out.println(hm.containsKey("India"));
   
  //to print all the keys
  Set<String> keys = hm.keySet();
  System.out.println(keys);

  for(String key: hm.keySet()){
      Integer val= hm.get(key);
      System.out.println(key + " "+ val);
  }


}  
}
