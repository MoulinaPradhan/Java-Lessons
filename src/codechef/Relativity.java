/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Relativity
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int g = Integer.parseInt(input[0]);
          int c =  Integer.parseInt(input[1]);
         
long ans = (c*c)/(2*g);
System.out.println(ans);

        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
