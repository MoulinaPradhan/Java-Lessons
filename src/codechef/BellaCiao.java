/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[4];
            input = sc.readLine().split(" ");
            
          int D = Integer.parseInt(input[0]);
          int d =  Integer.parseInt(input[1]);
           int P = Integer.parseInt(input[2]);
            int Q =  Integer.parseInt(input[3]);


        
long s=0;
long n = D/d;
if(n %2 ==0){
    s += ((n/2)*(2*P+(n-1)*Q))*d;
}
    else{
    
        s+= d*(n*(P+((n-1)/2)*Q));
    }
    s+= (D%d)*(P+(n)*Q);




System.out.println(s);


        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
