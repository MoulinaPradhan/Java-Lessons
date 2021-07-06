/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class MaximumProduction
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[4];
            input = sc.readLine().split(" ");
            
          int d = Integer.parseInt(input[0]);
          int x =  Integer.parseInt(input[1]);
           int y = Integer.parseInt(input[2]);
            int z =  Integer.parseInt(input[3]);

            int even =0,odd=0;
            int max =0;
            even = x*7;
            odd = (y*d)+(7-d)*z;
            max = Math.max(even, odd);
            System.out.println(max);

        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
