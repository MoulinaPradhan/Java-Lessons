package dp;
import java.util.*;

// Given n dices, each with m faces, numbered from 1 to m, find the number of ways to get a given sum X. X is the summation of values on each face when all the dice are thrown.
// Examples: 
 

// Input : faces = 4 throws = 2 sum =4 
// Output : 3 
// Ways to reach sum equal to 4 in 2 throws can be { (1, 3), (2, 2), (3, 1) }
// Input : faces = 6 throws = 3 sum = 12 
// Output : 25
 
public class NumWaysToGivenSUm {
    
    public static void main(String[] args) {
        int faces = 6, throwsVal = 3, sum = 12;
      
        System.out.println(NoOfWays(faces,throwsVal,sum));
    }
   
    public static int NoOfWays(int faces,int throwsVal,int sum){

        int dp[][] = new int [throwsVal+1][sum+1];
        // Arrays.fill(dp, -1);
        // base condition
        // if(sum ==0 && throwsVal==0) return 1;

        // if(sum <0 || throwsVal ==0)return 0;

        dp[0][0] = 0;
        for (int i = 1; i <= sum; i++) {
            if (i <= faces) {
                dp[1][i] = 1;
            } else {
                dp[1][i] = 0;
            }
        }

        for (int dice = 2; dice <= throwsVal; dice++) {

            for (int tsum = 1; tsum <= sum; tsum++) {
                //
                if (tsum > (faces * dice)) { //if sum not possible
                    dp[dice][tsum] = 0;
                    continue;
                }
                int sumDice = 0;
                for (int f = 1; f <= Math.min(faces, tsum); f++) {
                    //select f on current dice
                    //take remaining tsum-f sum ftom the rest of the dices
                    sumDice += dp[dice - 1][tsum - f];
                }
                dp[dice][tsum] = sumDice;
            }
        }

        return dp[throwsVal][sum];
    }
}
