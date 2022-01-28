// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1#

public class Stickler {
    public static void main(String[] args) {
        int nums[] ={5,5,10,100,10,5};
System.out.println(st(nums));
    }
    public static int st(int nums[]){
        if(nums.length ==1) return nums[0];
        int even = nums[0];
        int odd = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp = odd;
            odd = Math.max(even+nums[i], odd);
            even = temp;
        }
        return odd;
    }
}
