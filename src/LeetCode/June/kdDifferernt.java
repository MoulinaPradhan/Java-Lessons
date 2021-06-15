package June;

import java.util.HashMap;
import java.util.Map;

public class kdDifferernt {
    public static void main(String[] args) {
        int[] nums ={};
        int k=2;
        System.out.println(findPairs(nums,k));
    }

    public  static int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int res=0;
        for(int num : nums){
            map.put(num,(map.getOrDefault(num,0)+1));
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(map.containsKey(key+k)){
                res++;
            }

        }
        return res;
    }
}