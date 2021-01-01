package src.Arrays;

import java.util.*;


public class SpecialArray {
    public static void main(String[] args) {
     
    
    
       }
       
       
       
    public static int Special(int[]nums){

int n= nums.length;
        //Replace the element to length of array if it is greater than
        
        for(int i=0; i<n;i++){
            if(nums[i] >n){
nums[i]=n;
            }
        }

    int[] counts = new int[n+1];

    //save the count of element
    for(int i=0;i<n;i++){
        counts[nums[i]]++;
    }

    //now find the count of each remaining number in the range [0,length]
    for(int i=counts.length-2; i>=0;i--){
        counts[i] += counts[i+1];
    }
       
    //if there is special number then return 
    for(int i = 0; i < counts.length; i++){
        if(i == counts[i]) return i;
    }

    return -1;
}

}