package src.HashMaps;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] ={3,2,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int of = map.get(nums[i]);
                map.put(nums[i],of+1);
            }
            map.put(nums[i], 1);
        }
System.out.println(map);





    }
}
