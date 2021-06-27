import java.util.*;

public class CandyD {
    public static void main(String[] args) {
      int nums[] = {1,0,2};
      System.out.println(candy(nums));  
    }
    public static int candy(int[] ratings) {
int sum =0;
int dp[] = new int[ratings.length];
        Arrays.fill(dp,1);
        
        for(int i=1;i<dp.length;i++){
           if(ratings[i] > ratings[i-1]){
             
               dp[i]= dp[i-1]+1;
           }
         }
        
         for(int i=dp.length-2; i>=0;i--){
            if (ratings[i] > ratings[i + 1]) {
                dp[i] = Math.max(dp[i],dp[i+1]+1);
            }  
         }

         for(int i=0;i<ratings.length;i++){
             sum+=dp[i];
         }
         
         for(int e:dp)System.out.println(e);
return sum;
    }
}
