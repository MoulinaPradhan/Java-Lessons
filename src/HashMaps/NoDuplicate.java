package src.HashMaps;
import java.util.*;
public class NoDuplicate {
    public static void main(String[] args) {
        int nums[]={3,1,3,4,2};
        HashSet<Integer>h= new HashSet<>();
        int a=0;
       for(int i=0;i<nums.length;i++){
           if(h.contains(nums[i])){
               a=nums[i];
           }
           h.add(nums[i]);
       
       } 
        System.out.println(a);
        System.out.println(h);
    }
}
