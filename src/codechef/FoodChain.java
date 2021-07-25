/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class FoodChain
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int x = Integer.parseInt(input[0]);
          int y =  Integer.parseInt(input[1]);
          
         int count=1;
         int num = x/y;
         while(num>0){
             count++;
             num = num/y;
         }
         System.out.println(count);

       
        





        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
