import java.util.*;

public class nQueen {
public static void main(String[] args) {
    int n =4;
System.out.println(nQueen(n));
}   
static ArrayList<ArrayList<Integer>> nQueen(int n) {
    int[][] m=new int[n][n];
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> rsf = new ArrayList<Integer>();
    nQueen(m,0,rsf,result);
    return result;
}

public static void nQueen(int[][] m,int row,ArrayList<Integer> rsf,ArrayList<ArrayList<Integer>> result){

    if(row==m.length){
        result.add(new ArrayList<>(rsf));
        return;
    }
    
    for(int col=0;col<m.length;col++){
        if(isSafeToPlaceQueen(m,row,col)){
            m[row][col]=1;
            rsf.add(col+1);
            nQueen(m,row+1,rsf,result);
            rsf.remove(new Integer(col+1));
            m[row][col]=0;
        }
    }
}

public static Boolean isSafeToPlaceQueen(int[][] m,int row,int col){
    for(int i=row-1,j=col;i>=0;i--){
        if(m[i][j]==1){
            return false;
        }
    }
    for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(m[i][j]==1){
            return false;
        }
    }
    
    for(int i=row-1,j=col+1;i>=0&&j<m.length;i--,j++){
        if(m[i][j]==1){
            return false;
        }
    }
    return true;
}   
} 

