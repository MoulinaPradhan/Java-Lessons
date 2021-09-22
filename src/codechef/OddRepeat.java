/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class OddRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int n = Integer.parseInt(input[0]);
          int k =  Integer.parseInt(input[1]);
           int s = Integer.parseInt(input[2]);
        


        
long ans=(s-(n*n))/(k-1);
System.out.println(ans);



        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
