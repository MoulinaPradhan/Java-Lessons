/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class SubarrayPermutaion
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int N = Integer.parseInt(input[0]);
          int K =  Integer.parseInt(input[1]);

          
          if(K==1 && N==1) {
              System.out.print(1);
          }
        else if(K<2 || K>N) System.out.print(-1);
        else{
        int count =0;
        for(int i=0;i<=K-2;i++){
        System.out.print(i+1+" ");
        count=i;
    }
    for(int i=0;i<N-count-1;i++){
        System.out.print(N-i+" ");
    }
}
System.out.println();

        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
