/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class ChessFormat
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int a = Integer.parseInt(input[0]);
          int b =  Integer.parseInt(input[1]);
          
          int sum = a+b;

          if(sum<3){
              System.out.println(1);
          }
          else if(3<=sum && sum<=10){
              System.out.println(2);
          }else if(11<=sum && sum<=60){
         System.out.println(3);
          }else{
              System.out.println(4);
          }
        





        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
