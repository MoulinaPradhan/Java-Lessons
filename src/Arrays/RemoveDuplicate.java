
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] ={1,1,2};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int ans=1,i=0,j=1;
       while(j<nums.length){
           if(nums[i]==nums[j]){
               j++;
           }else{
               nums[ans++]=nums[j];
               i=j;
           }
       }
    //    for(int e:nums)System.out.println(e);
       return ans;
}
}
