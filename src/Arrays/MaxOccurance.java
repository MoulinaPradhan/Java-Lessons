package src.Arrays;
import java.util.Map.*;
import java.util.*;

public class MaxOccurance {
    public static void main(String[] args) {

    int arrA[]={2, 1, 5,2,1, 1, 2};

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i <arrA.length; i++) {
        if(map.containsKey(arrA[i])){
            map.put(arrA[i],map.get(arrA[i])+1);
        }else{
            map.put(arrA[i], 1);
        }
    }

    //traverse the map and track the element which has max count
    Iterator entries = map.entrySet().iterator();
    int maxCount = 0;
    int element =arrA[0];
    while(entries.hasNext()){
        Map.Entry entry = (Map.Entry) entries.next();
        int count = (Integer)entry.getValue();
        if(maxCount<count){
            maxCount = count;
            element = (Integer)entry.getKey();
        }
    }
    System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCount);
   
}


}
