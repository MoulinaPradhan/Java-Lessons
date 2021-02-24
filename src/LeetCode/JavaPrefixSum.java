package src.LeetCode;
import java.util.*;

public class JavaPrefixSum {
   public static void main(String[] args) {
    int arr[] ={ 2,3,-1,4,-6,-8};
    
    int prearr[] = new int [arr.length];
    prearr[0] =arr[0];

    for(int i=1;i<arr.length;i++){
        prearr[i] = prearr[i-1] + arr[i];
        System.out.println(prearr[i]);
    }
    //
    System.out.println("Sum of number from index 1 to 3");
    int sum = prearr[3] - arr[1-1]; // prearr[j] -  arr[i-1]
    System.out.println(sum);
   } 
}
