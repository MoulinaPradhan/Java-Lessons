package src.Arrays;

public class AdditionSquareMatrix {
    public static void main(String[] args) {
        
    }
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        int res[][] = new int [matrixA.length][2];
      for(int i =0;i<matrixA.length;i++){
        
              int sum = matrixA[i][0] + matrixB[i][0];
              int sum2 =  matrixA[i][1] + matrixB[i][1];
          res[i][0]=sum;
          res[i][1]=sum2;
      }
      
    }
}
