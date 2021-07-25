/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class CricketPlayer
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int r1 = Integer.parseInt(input[0]);
          int w1 =  Integer.parseInt(input[1]);
           int c1 = Integer.parseInt(input[2]);
          
           String[] input2 = new String[3];
            input2 = sc.readLine().split(" ");

            int r2 = Integer.parseInt(input2[0]);
            int w2 =  Integer.parseInt(input2[1]);
             int c2 = Integer.parseInt(input2[2]);
        
long A=0,B=0;
// A= r1+w1+c1;

// B=r2+w2+c2;

if(r1>r2){
    A=A+1;
}else{
    B=B+1;
}

if(w1>w2){
    A=A+1;
}else{
    B=B+1;
}

if(c1>c2){
    A=A+1;}else{
    B=B+1;
    }

if(A> B){
    System.out.println("A");
} else{
    System.out.println("B");
}




        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
