


/**
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 */



public class SumOfOddLength {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        
        int n = arr.length;
        for(int i =0;i<n;i++){
            int end=i+1;
            int start=n-i;
            
            int total=start * end;
            int odd= total/2;
            
            if(total%2 == 1){
                odd++;
            }
            result+=odd*arr[i];
        }
        return result;
    }
}
