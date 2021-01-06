package src.HashMaps;

import java.util.*;

/**
 * Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
 
*/

public class GoodPair {
    
    public static void main(String[] args) {
        int nums[] ={1,2,3,1,1,3};
   HashMap<Integer,Integer> hm= new HashMap<>();
int result=0;
   for(int i=0;i<nums.length;i++){
if(hm.containsKey(nums[i])){
    result += hm.get(nums[i]);
}
hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    System.out.println(result);

}


}