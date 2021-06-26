

public class LargestElement {
    public static int majorityElement(int[] nums) {
        int max= nums[0];
         for(int i=0;i<nums.length;i++){
             if(max<nums[i]){
                 max=nums[i];
             }
         }
         return max;
     }
     public static void main(String[] args) {
         int nums[]={3,3,4};
         System.out.println(majorityElement(nums));
     }
}
