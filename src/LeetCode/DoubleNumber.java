

import java.util.*;

public class DoubleNumber {
    public static void main(String[] args) {
        int arr[]={-2,0,10,-19,4,6,-8};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains(arr[i]/2)))
               System.out.println(true);
            set.add(arr[i]);
        }
      System.out.println(false); 
  System.out.println(-5%2);      
    }
}
