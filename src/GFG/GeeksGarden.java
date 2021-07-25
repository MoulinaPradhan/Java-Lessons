/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GeeksGarden {
	public static void main (String[] args)throws IOException  {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(sc.readLine());
	while(t-->0)
	{
	    String input[] = sc.readLine().split(" ");
	    int n = Integer.parseInt(input[0]);
	     int m = Integer.parseInt(input[1]);
	     
	     int [][]arr = new int[n][m];
	     
	     for(int i=0;i<n;i++){
	         input = sc.readLine().split(" ");
	         for(int j=0;j<m;j++){
	             arr[i][j] = Integer.parseInt(input[j]);
	         }
	     }
	     
	     int area=0,max=0;
         int ans =0;
	     for(int i=0;i<n;i++){
	         for(int j=0;j<m;j++){
	             if(arr[i][j] == 1){
                     int c=0;
	             fun(area,arr,i,j,max);
	                ans= Math.max(ans,c);
                     System.out.println(max+"  uu->  "+ area);
	             }
	         }
	     }
	   System.out.println(max+" "+area+" "+ans);
	}
	}
	public static void fun(int area, int arr[][],int i, int j,int max){
	    if(i<0||i>=arr[0].length||j<0||j>=arr.length||arr[i][j]==0){
        return ;
        }
        
        area++;
        max=Math.max(max,  area);
        arr[i][j] = 0;
     
        fun(area,arr,i-1,j,max);
         fun(area,arr,i+1,j,max);
          fun(area,arr,i,j+1,max);
           fun(area,arr,i,j-1,max);
            fun(area,arr,i-1,j-1,max);
             fun(area,arr,i+1,j-1,max);
              fun(area,arr,i-1,j+1,max);
               fun(area,arr,i+1,j+1,max);
               System.out.println(" loop ->  "+ area);
              
               System.out.println(max+"  ->  "+ area);
            //   return max;
	}
	
}