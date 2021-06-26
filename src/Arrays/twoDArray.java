

import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        // int arr[][]=new int[10][10];

        int at[]= {1,5,3,8};
        int[][] arr = { { 1, 9 }, { 1, 4 } }; 
  
Scanner sc= new Scanner (System.in);
Arrays.sort(at);
for(int e: at) System.out.print(e);
System.out.println(" ");

Arrays.sort(arr,(a,b) -> (b[0]-a[0])); //sorting 2D Array in descending order

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
   System.out.print(arr[i][j] +" ");
            }
        }

    }
}
