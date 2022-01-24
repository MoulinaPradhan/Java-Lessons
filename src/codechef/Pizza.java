/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Pizza
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int X = Integer.parseInt(input[0]);
          int P=  Integer.parseInt(input[1]);
           int B= Integer.parseInt(input[2]);
         

if(X >=P){
    System.out.println("PIZZA");
}else if(X>=B){
    System.out.println("BURGER");
}else{
    System.out.println("NOTHING");
}


        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
