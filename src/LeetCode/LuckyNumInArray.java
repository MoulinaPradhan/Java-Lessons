

import java.util.*;

public class LuckyNumInArray {
    public static void main(String[] args) {
       int arr []= {2,2,3,4};
       
       Map<Integer, Integer> hm = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(hm.containsKey(arr[i])){
               int of = hm.get(arr[i]);
               hm.put(arr[i], of+1);
           }else{
               hm.put(arr[i],1);
           }
        }

    int lucky=0;
    for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        if(entry.getKey()==entry.getValue()){
            lucky = entry.getKey();
        }
    }

// System.out.println(hm);
System.out.println(lucky);
       
       
       
       
        
    }
}
