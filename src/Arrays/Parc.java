package src.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int l,i,j,k;
    l=nums.length;
    int x[]= new int[2];
    for(i=0;i<(l-1);i++)
    {
    int min=nums[i];
    int diff=target-min;
    for(j=(i+1);j<l;j++)
    {
    k=j;
    if(nums[j]==diff)
    {
    return new int[]{i,j};
    }
    }
    }
    return new int[2];
    }
    }
