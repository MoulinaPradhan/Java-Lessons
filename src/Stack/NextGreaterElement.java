package src.Stack;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums1[]={1,3,5,2,4};
        int nums2[] = { 6,5,4,3,2,1,7} ;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=1;i<nums2.length;i++){
            map.put(nums2[i-1],nums2[i]);
        }
        map.put(nums2[nums2.length-1], 0);

        int arr[] = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            if(nums1[i] < map.get(nums1[i])){
                arr[i] = map.get(nums1[i]);
            }else{
                arr[i] = -1;
            }
        }
// for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//        if(entry.getValue()>entry.getKey()){
//            arr[i] = entry.getKey();
//        }
// }

System.out.println(map);
for(int e: arr)System.out.println(e);

    }
}
