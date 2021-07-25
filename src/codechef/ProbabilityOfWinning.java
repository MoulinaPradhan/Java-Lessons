/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class ProbabilityOfWinning {

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
         
double diff =0, sum =0;
sum = x+y;
if(sum >=6){
    System.out.println(0);
}else{
    diff = 6-sum;
    double ans = diff/6;
    System.out.println(ans);
}



        







        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
