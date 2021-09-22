/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class NortexBooster
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int N = Integer.parseInt(input[0]);
          int H =  Integer.parseInt(input[1]);
          String [] hideout= new String[H];
          hideout = sc.readLine().split(" ");
          
        List<List<Integer>>list = new ArrayList<>();

   for(int i=0;i<N;i++){
    list.add(new ArrayList<>());   
   }
        for(int i=0;i<N-1;i++){
            String arr[] = sc.readLine().split(" ");
            list.get(Integer.parseInt(arr[0])).add(Integer.parseInt(arr[1]));
         
        }


        // System.out.println(list);

     List<Integer> hide = new ArrayList<>();

for(int i=0;i<H;i++){
int m = Integer.parseInt(hideout[i]);
hide.add(m);

}



System.out.println(orangesRotting(list, hide));
        
      
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
    public static int orangesRotting(List<List<Integer>> grid,List<Integer> hide){
    {
          if(grid == null || grid.size()== 0) return 0;
        int rows = grid.size();
       
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
 
        for(int i = 0 ; i < rows ; i++) {
            int cols = grid.get(rows).size();
            for(int j = 0 ; j < cols ; j++) {
                if(grid.get(i).get(j) == 2) {
                    queue.offer(new int[]{i , j});
                }
                else if(hide.contains(grid.get(i).get(j))) {
                    count_fresh++;
                }
            }
        }
    
        if(count_fresh == 0) return 0;
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
   
        while(!queue.isEmpty()) {
            ++count;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int dir[] : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
   
                    if(x < 0 || y < 0 || x >= rows || y >= grid.get(rows).size() || hide.contains(grid.get(x).get(y))) continue;
                  
                    // grid[x][y] = 2;
              
                    queue.offer(new int[]{x , y});
           
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count-1 : -1;
    }
}
}

