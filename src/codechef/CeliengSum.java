/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class CeilingSum 
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          long a = Integer.parseInt(input[0]);
         long b =  Integer.parseInt(input[1]);

         long sum =0;
if(a==b){
  sum=0;
}
else if (b>a){
sum =(b-a)/2+1;
}
else if(a>b){
  if( (a-b)%2 !=0){
sum =(b-a)/2;
  }else{
    sum = (b-a)/2+1;
  }
}

System.out.println(sum);



        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
