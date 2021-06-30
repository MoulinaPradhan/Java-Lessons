import java.util.*;
import java.io.*;

public class MaximalRectangle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m = sc.nextInt();
    
  char a[][] = new char[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        a[i][j] = sc.next().charAt(0);
    }
    System.out.println("The ans: ");
    System.out.println(maximalRectangle(a));
}  
public static  int maximalRectangle(char[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
  
  int[] height = new int[matrix[0].length];
  for(int i = 0; i < matrix[0].length; i ++){
      if(matrix[0][i] == '1') height[i] = 1;
  }
  int result = largestRectangleArea(height);
  for(int i = 1; i < matrix.length; i ++){
      resetHeight(matrix, height, i);
      result = Math.max(result, largestRectangleArea(height));
  }
  
  return result;
}

private static void  resetHeight(char[][] matrix, int[] height, int idx){
  for(int i = 0; i < matrix[0].length; i ++){
      if(matrix[idx][i] == '1') height[i] += 1;
      else height[i] = 0;
  }
}    

  
  public static int largestRectangleArea(int[] heights) {
      int len = heights.length;
      Stack<Integer> s = new Stack<>();
      int maxArea = 0;
      for (int i = 0; i <= len; i++){
          int h = (i == len ? 0 : heights[i]);
          if (s.isEmpty() || h >= heights[s.peek()]) {
              s.push(i);
          } else {
              int tp = s.pop();
  maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1- s.peek()));
              i--;
          }
      }
      return maxArea;
  }  
}
