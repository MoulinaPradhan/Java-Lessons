/* package codechef; // don't place package name! */

/*June*/

import java.util.*;



import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class ChefVisa
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

              int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
            String input [] = new String[6];
            input = sc.readLine().split(" ");

            int x1 = Integer.parseInt(input[0]);
            int x2 = Integer.parseInt(input[1]);
            int y1 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);
            int z1 = Integer.parseInt(input[4]);
            int z2 = Integer.parseInt(input[5]);

      
           if(x2>x1 && y2>y1 && z2>z1){
            System.out.println("Yes");
           }else{
               System.out.println("No");
           }

        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
