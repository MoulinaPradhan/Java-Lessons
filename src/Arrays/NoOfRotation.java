

// to find the no of rotation, need to find the index of the smallest element

import java.util.Arrays;

/**
 * Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.
 N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
 
 */


public class NoOfRotation {
  public static int findKRotation(int arr[], int n) {
    int min = arr[0];  
   int index=0;
    for (int i = 0; i < arr.length; i++) {  
        //Compare elements of array with min  
       if(arr[i] <min)  {
      min=arr[i];
      index=i;
    break;   
    }
}

return index ;
    }

 public static void main(String[] args) {
    int arr[]={5, 1, 2, 3, 4};
    int n=2;
    System.out.println(findKRotation(arr, n));    
    }
}
