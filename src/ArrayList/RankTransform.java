package src.ArrayList;
import java.util.*;

public class RankTransform {
   public static void main(String[] args) {
       int arr[] ={40,10,20,30};
       int b[] = arr.clone();
Arrays.sort(b);
Map<Integer,Integer> map = new HashMap<>();
for(int i=0;i<b.length;i++){
    map.put(b[i], i+1);
}
// System.out.println(map);
int res[] = new int[arr.length];

for(int i=0;i<arr.length;i++){
    res[i] = map.get(arr[i]);
   } 
}
}