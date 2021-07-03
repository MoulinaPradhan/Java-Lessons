package dp;

// Given a value N, find the number of ways to make change for N cents, if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins. 

// Example 1:

// Input:
// n = 4 , m = 3
// S[] = {1,2,3}
// Output: 4
// Explanation: Four Possible ways are:
// {1,1,1,1},{1,1,2},{2,2},{1,3}.

public class CoinChange {
 public static void main(String[] args) {
     
 } 
 
 public long count(int S[], int m, int n) 
 { 
     long dp[] = new long[(int)n+1];
     dp[0] =1;
     for(int i = 0; i < m; i++)
     {
         for(int j =S[i]; j <= n; j++)
         {
             dp[j] += dp[j - S[i]];
         }
     }
     
     return dp[n];
 } 
}

