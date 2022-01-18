import java.util.*;

public class CheckEveryRowColumnContainsNumber {
   public static void main(String[] args) {
       int matrix[][]={{1,3,2},{2,1,3},{3,2,1}};
       System.out.println(checkIfValid(matrix));
   } 

//    public static boolean checkIfValid( int matrix[][]){
//        int n = matrix.length;
  
// for(int r=0;r<matrix.length;r++){
//     Set<Integer> row = new HashSet<>();
//     Set<Integer> col = new HashSet<>();
//     for(int c =0;c<matrix[r].length;c++){
//         row.add(matrix[r][c]);
//         col.add(matrix[c][r]);
//     }
//     if(row.size()<n || col.size()<n) return false;
// }

// return true;
//    }

public static boolean checkIfValid(int[][] matrix) {
    int n = matrix.length;
    
    for (int r= 0; r < n; r++) {
        int rowXor = 0;
        int colXor = 0;
        for (int c = 0; c< n; c++) {
            
            rowXor ^= matrix[r][c] ^ (c + 1);
            colXor ^= matrix[c][r] ^ (c + 1);
        }
        if (rowXor != 0 || colXor != 0)
            return false;
    }
    return true;
    
}
}
