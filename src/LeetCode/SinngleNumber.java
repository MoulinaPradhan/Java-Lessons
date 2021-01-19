package src.LeetCode;
import java.util.*;

public class SinngleNumber {
  public static void main(String[] args) {
      int nums[]={1,2,1,3,2,5};
     Map<Integer,Integer> h = new HashMap<>();
      int a=0,b=0;
      for(int i=0;i<nums.length;i++){
          if(h.containsKey(nums[i])){
           int of=h.get(nums[i]);
           h.put(nums[i],of+1);
           of++;
             }
          else{
              h.put(nums[i],1);
             
          }
      }
 
int arr[] = new int [2];int i=0;
      for(Map.Entry<Integer,Integer> set : h.entrySet()){
          if(set.getValue()==1){
            //   b=h.get(set);
              a=set.getKey();
            
          }
      }
      
      System.out.println(h);
      System.out.println(a);
      System.out.println(b);
  }  
}
