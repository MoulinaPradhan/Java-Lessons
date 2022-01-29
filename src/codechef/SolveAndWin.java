/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class SolveAndWin
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int A = Integer.parseInt(input[0]);
          int B =  Integer.parseInt(input[1]);
           int C= Integer.parseInt(input[2]);
            

           if(A == B+C){
               System.out.println("Yes");
           }else if(B == A+C){
               System.out.println("Yes");
           }else if(C==A+B){
               System.out.println("Yes");
           }else{
               System.out.println("NO");
           }


        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
