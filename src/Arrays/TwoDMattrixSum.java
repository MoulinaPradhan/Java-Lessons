import java.util.*;


public class TwoDMattrixSum {

    public static void main(String[] args) {
        int m = 2;
        int n=2;
        int mat [][] = {{1,0},{1,1}};
    
        for(int row=1;row<m;row++){
            for(int col = 1;col < n;col++){
             
                int dia= (mat[row-1][col-1] * mat[row][col]) - ( mat[row-1][col] * mat[row][col-1]);
                System.out.println(dia);

            }
        } 
    }
  

}
