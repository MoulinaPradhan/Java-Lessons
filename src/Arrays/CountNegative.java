package src.Arrays;
import java.util.*;
/**
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
Example 3:

Input: grid = [[1,-1],[-1,-1]]
Output: 3
Example 4:

Input: grid = [[-1]]
Output: 1

 */

public class CountNegative {
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);      
            for(int k:grid[i]){    
                if(k>=0){            
                    break;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        // int grid[][]= {{ 4,3,2,-1 },{ 3,2,1,-1},{ 1,1,-1,-2}, { -1,-1,-2,-3}};
        int grid[][]={{5,1,0},{-5,-5,-5}};
      
        System.out.println(countNegatives(grid));
    }
}
