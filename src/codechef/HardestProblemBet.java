/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class HardestProblemBet
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int a = Integer.parseInt(input[0]);
          int b =  Integer.parseInt(input[1]);
           int c = Integer.parseInt(input[2]);
        

if(a<b && a<c){
    System.out.println("Draw");
}
else if(b<a && b<c){
    System.out.println("Bob");
}else {
    System.out.println("Alice");
}







        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
