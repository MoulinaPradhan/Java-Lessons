package src.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    
    public static void reverse(int[] a, int i, int j){
        int li=i;
        int ri=j;

        while(li<ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int []a,int k){
        k=k%a.length;
        if(k<0){
            k= k+a.length;
        }
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }

public static void main(String[] args) {
    int a[]={1,4,7,3,8,9};
    int k=3;

}
}
