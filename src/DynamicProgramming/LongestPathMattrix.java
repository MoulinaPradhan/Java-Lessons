package src.DynamicProgramming;

public class LongestPathMattrix {
    public static void main(String[] args) {
        int matrix[][] = { {9,9,4}, {6,6,8}, {2,1,1}};
        int max=1;
        int M=matrix.length, N=matrix[0].length;
       
        int [][] dp= new int[M][N];
        for(int i=0; i< matrix.length;i++){
            for (int j=0; j < matrix[i].length; j++ ){
                max = Math.max(max, process3(matrix,i,j,dp));
            }
        }
 System.out.println(max);
        
    }


public static int process3(int[][] matrix, int i,int j, int [][]dp){
   if(i<0 || i == matrix.length || j < 0 || j == matrix[0].length){
       return 0;
   }
   
   if(dp[i][j] != 0) return dp[i][j];

   int left =1;
   int right=1;
   int up = 1;
   int down =1;

   down += (i + 1 < matrix.length && matrix[i + 1][j] > matrix[i][j]) ? process3(matrix, i + 1, j, dp) : 0;
   up += (i - 1 >= 0 && matrix[i - 1][j] > matrix[i][j]) ? process3(matrix, i - 1, j, dp) : 0;
   left += (j - 1 >= 0 && matrix[i][j - 1] > matrix[i][j]) ? process3(matrix, i, j - 1, dp) : 0;
   right += (j + 1 < matrix[0].length && matrix[i][j + 1] > matrix[i][j]) ? process3(matrix, i, j + 1, dp) : 0;

   dp[i][j] = Math.max(down, Math.max(up, Math.max(left, right)));
   return dp[i][j];
   
}


}
