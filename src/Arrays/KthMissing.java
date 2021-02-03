package src.Arrays;

import java.util.*;

public class KthMissing {
   public static void main(String[] args) {
       int arr[] = {1,2,3,4};
       int k = 2;

   ArrayList<Integer> al = new ArrayList<>();
   for(int i=1;i<=1000;i++){
       al.add(i);
   }

   for(int i=0;i<arr.length;i++){
   if(al.contains(arr[i])){
    al.remove(al.indexOf(arr[i]));
}
   }

   System.out.println(al.get(k-1));

// for(int i:al)System.out.println(i);

   } 
}
