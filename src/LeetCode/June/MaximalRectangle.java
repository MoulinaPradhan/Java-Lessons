package June;
import java.util.*;

public class MaximalRectangle {
    public static void main(String[] args) {
        char matrix [][] = {{'1','1','0','1','0','1'},{'0','1','0','0','1','1'},{'1','1','1','1','0','1'},{'1','1','1','1','0','1'}};
        
     

        int arr[] = new int [matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            arr[j]+=Character.getNumericValue( matrix[i][j]);
            if(matrix[i][j] =='0'){
                arr[j]=0;
            }
            System.out.println(arr[j]+"  i "+i+"  j"+ j);
            }
           
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("ans   "+largestRectangleArea(arr));
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
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
