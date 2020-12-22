package src.ArrayList;
import java.util.*;
/**
 * 
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
 
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/


class Solution {
    public static void main(String[] args) {
        int nums[]={1,4,56,20};
       
    }
    public int[] twoSum(int[] nums, int target) {
         List<Integer> complements = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
		// Check if we already have this number in required complments
            if (complements.contains(nums[i])) {
                return new int[]{i, complements.indexOf(nums[i])};
            } else {
                complements.add(target - nums[i]);
            }
        }
//For no solution
        return new int[]{0,0};
    }
}