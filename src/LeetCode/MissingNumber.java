
import java.util.*;

public class MissingNumber {
  public static void main(String[] args) {
      int nums[]={9,6,4,2,3,5,7,0,1};
      Arrays.sort(nums);
      int a=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i] != i+1){
              a=i+1;
          }
      }
      System.out.println(a);
  }  
}
