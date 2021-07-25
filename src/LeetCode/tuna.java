public class tuna {
    public static void main(String[] args) {
        System.out.println("HU");
    
        int mat[][] = {{9,9,4},{6,6,8},{2,1,1}};
    
        int m = mat.length;
        int n = mat[0].length;
        int max=0,sum=0;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] == false){
                    sum= dfs(mat, i,j, m, n,0,visited,0);
                    max=Math.max(max,sum);
                }
 
            }

}
System.out.println(max);
System.out.println("ans++");
System.out.println(longestIncreasingPath(mat));
    }
public static int dfs(int[][] mat, int i, int j,int m, int n,int max,boolean [][]visited,int sum) {
if(i < 0 || i >= m || j < 0 || j >= n || visited[i][j] == true){
    return sum;
}

System.out.print(mat[i][j]+ "   mat -->");
    visited[i][j] = true;
    sum+= mat[i][j];
    int cd = dfs(mat,i,j-1,m,n,max,visited,sum);
    int md= dfs(mat,i+1,j,m,n,max,visited,sum);
    sum = dfs(mat,i-1,j,m,n,max,visited,sum);
    sum = dfs(mat,i,j+1,m,n,max,visited,sum);
return sum;
}
private static int m;
private static int n;
private  static int[][] maxILen;
// private static int[][] matrix;

public static int longestIncreasingPath(int[][] matrix) {
    
    m = matrix.length;
    if(m < 1) return 0;
    n = matrix[0].length;
    // this.matrix = matrix;
    
    maxILen = new int[m][n];
    int max = 1;
    
    for(int i=0;i<m;i++){
        
        for(int j=0;j<n;j++){
            max = Math.max(max, maxDFS(i,j,matrix));                        
        }
    }
    
    return max;
}

private static int maxDFS(int i,int j,int[][]matrix){
    if(maxILen[i][j] != 0) return maxILen[i][j];
    
    int max = 1;
    if(i+1 < m && matrix[i+1][j] > matrix[i][j]) max = Math.max(max, 1 + maxDFS(i+1,j,matrix));
    if(i-1 >= 0 && matrix[i-1][j] > matrix[i][j]) max = Math.max(max, 1 + maxDFS(i-1,j,matrix));
    if(j+1 < n && matrix[i][j+1] > matrix[i][j]) max = Math.max(max, 1 + maxDFS(i,j+1,matrix));
    if(j-1 >= 0 && matrix[i][j-1] > matrix[i][j]) max = Math.max(max, 1 + maxDFS(i,j-1,matrix));
    maxILen[i][j] = max;
    return max;
}

}