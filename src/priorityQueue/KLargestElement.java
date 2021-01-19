package src.priorityQueue;
import java.util.*;

public class KLargestElement {
   public static void main(String[] args) {
       int k=3;
       int arr[] = { 2,4,2,1,3,7,8,9,67,90};

       PriorityQueue<Integer> pq= new PriorityQueue<>();
       for(int i=0; i<arr.length;i++){
           if(i<k){
               pq.add(arr[i]);
           }else{
               if(arr[i] > pq.peek()){
                   pq.remove();
                   pq.add(arr[i]);
               }
           }
       }

       while(pq.size()>0){
           System.out.println(pq.remove());
       }
   } 
}

// space complexity -O(k) .... because only k numbers are stored
// n log(k) - time complexity