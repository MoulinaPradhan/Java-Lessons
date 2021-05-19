import java.util.*;


public class KnapSack {
    public static void main(String[] args) {
        int values[] = {1,2,3};
        int weight[] = {4,5,1};
        int W=4;
        int dp[][] = new int [values.length+1][W+1];
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<W+1;j++){
                if(j >= weight[i-1]){
                    int rem = j - weight[i-1];

                    if(dp[i-1][rem] + values[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rem] + values[i-1];
                    }else{

                        dp[i][j] = dp[i-1][j]; // when we aren't taking the weight
                    }
                }
                else{

                    dp[i][j] = dp[i-1][j]; // when we aren't taking the weight
                }
                // System.out.println(dp[i][j]);
            }
        }

        System.out.println(dp[dp.length-1][W]);
    }
}
