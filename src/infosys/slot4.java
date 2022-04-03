import java.util.*;
import java.lang.*;
import java.io.*;


public class slot4 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String ip[] =sc.nextLine().split(",");
        int n = ip.length;

        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            if(ip[i].equals("B"))
            arr[i] =0;
            else
            arr[i] =1;
        }
 
    System.out.println(minSwaps(arr, n));

    }
   public static int minSwaps(int[] nums, int n)
{
   
    int count = 0;
       for (int d : nums) {
         if (d == 1) {
                count++;
            }
       }
          int len = nums.length;
        int min = Integer.MAX_VALUE;
     int start = 0;
      int end = 0;
int zeros = 0;
    while (end < len) {
     if (nums[end] == 0) {
       zeros++;
       }
 
if (end - start + 1 > count) {
if (nums[start] == 0) {
           zeros--;
        }
                start++;
           }
            if (end - start + 1 == count) {
                min = Math.min(min, zeros);
         }
           end++;
        }
        if(min ==0) return -1;
       return min;
                           
}
}
