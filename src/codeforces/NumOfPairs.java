/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumOfPairs {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());

        while(t --> 0){
            
            String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int n = Integer.parseInt(input[0]);
          int l =  Integer.parseInt(input[1]);
           int r = Integer.parseInt(input[2]);
          
           int arr[] = new int[n];
String line = sc.readLine(); 
String[] strs = line.trim().split("\\s+");
for (int i = 0; i < n; i++) {
    arr[i] = Integer.parseInt(strs[i]);
}

       
int count=0;
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                 int sum =arr[i]+arr[j];
                 if(sum <=r && sum >=l){
                 
                     count++;
                 }

              }
          }
System.out.println(count);
        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
   

