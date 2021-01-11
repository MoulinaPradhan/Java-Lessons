package src.HashMaps;

import java.util.*;

/**
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]

 */

public class FrequencySort {
    public static int[] frequencySort(int[] nums) {
       
        Map<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>(new Comparator<Map.Entry<Integer,Integer>>(){
           public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2){
               int c = e1.getValue() - e2.getValue();
               if(c == 0){
                   return e2.getKey() - e1.getKey();
               }
               return c;
           }
       });
       for(Map.Entry<Integer,Integer> e : map.entrySet()){
           q.add(e);
       }
       int index = 0;
       int ans[] = new int[nums.length];
       while(!q.isEmpty()){
           Map.Entry<Integer, Integer> e = q.poll();
           int i = 0;
           int value = e.getValue();
           int key = e.getKey();
           while(i < value){
              ans[index++] = key;
              i++;
           }
       }
       return ans;
    }
    


    public static void main(String[] args) {
    int [] nums={1,1,2,2,2,3};
System.out.println(frequencySort(nums));

// List<Integer>list = Arrays.asList(nums);


    // System.out.println(minHeap);
// System.out.println(map);












}
}
