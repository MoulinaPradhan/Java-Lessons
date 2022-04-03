
    /* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
public class WebPages
{
	public static void main (String[] args) throws java.lang.Exception
	{

	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
             int N = Integer.parseInt(sc.readLine());
             List<List<Integer>>webPages =  new ArrayList<>();

             for(int i=0;i<=N;i++){
                 webPages.add(new ArrayList<>());
             }
             for(int i = 1;i<=N ; i++ ){
                String str= sc.readLine();
                String[] arr = str.split(" ");
              
                int[] iarr = new int[arr.length];
                for(int j = 0; j<arr.length; j++){
                    iarr[j] = Integer.parseInt(arr[j]);
                    webPages.get(i).add(iarr[j]);
                }
        
            }
            String start []= new String[2];
            start= sc.readLine().split(" ");

  if(webPages.size()==0) System.out.println(-1);
  else

System.out.println(bfs(N,webPages,Integer.parseInt(start[0]),Integer.parseInt(start[1])));
 }
        public static int bfs(int V,List<List<Integer>> webPages,int start,int end)
        {
            if(start == end) return 0;
     
        boolean check[] = new boolean[V+1];
   
        Deque<Integer> array = new ArrayDeque<Integer>();
               
     array.add(start); 
       check[start] = true; 
        int count =0;
        
        while (!array.isEmpty())
        {
            Integer out = array.removeFirst();
            array.poll();

 count++;
            for(Integer it: webPages.get(out)) {
                if(it == end) return count;
                if(check[it] == false) {
                    check[it] = true; 
                    array.add(it); 
                } 
            }
        }
        
return -1;
    }
        }
  