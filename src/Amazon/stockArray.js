// Given An Array Of N integers and a Number K return max sum of subarray of size k that has K Distinct Elements. if it does not exist return -1.

// Test Case:
// [1,2,3,4,4,3,2,1],k=3
// Output:
// 9
// [1,2,3],[2,3,4],[4,3,2],[3,2,1] are valid subarrays as they have k distinct elements.max sum among them is 9

// Test Case:
// [1,2,2] k=3
// Output:
// -1
// No valid subarray of length k exist that has all k elements unique.

// Constrainst:
// 1<=n<=1e5
// k<=n
// 1<=arr[i]<=1e9

import java.util.*;
public class text{
    public static void main(String[] args) {
        int[] stock = new int[]{1,2,7,7,4,3,6};
        int k = 3;
        System.out.println(MaxSubarraySum(stock,k));
     }
        
    public static int MaxSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0, res = -1, sum = 0;
        
        for(int right = 0; right<nums.length; right++)
        {
            while(left < right && (set.contains(nums[right]) || set.size() >= k))
            {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            sum +=nums[right];
            set.add(nums[right]);
            if (set.size() == k)
                res = Math.max(res, sum);
        }
            return res;
        }
    }
