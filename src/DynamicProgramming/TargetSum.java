import java.util.*;


public class TargetSum {
   public static void main(String[] args) {
       int nums[] = {1,1,1,1,1};
       int target =3;
       
       int dp[][] = new int [nums.length+1][target+1];

       for(int i=1;i<dp.length;i++){
           for(int j=1;j<target+1;j++){
               dp[i][j] = dp[i-1][j]+nums[i-1];
           }
       }

       System.out.println(dp[dp.length-1][target]);
   } 
}
