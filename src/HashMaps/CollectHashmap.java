package src.HashMaps;

import java.util.*;


public class CollectHashmap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hm= new HashMap<>();
        int t= sc.nextInt();
        for(int i=0;i<=t;i++){
            int val=sc.nextInt();
            String key=sc.next();
            System.out.println("key"+ key);
            System.out.println("number"+ val);
         
           
            hm.put(key,val);
  }
  System.out.println(hm);
  for(String keys: hm.keySet()){
if("stri"==keys) {
    System.out.println(keys);
    
}
else System.out.println("-1");
  }
    }
}
