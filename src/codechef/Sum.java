// don't place package name! */

/*June*/

import java.util.*;



import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    
             String[] input = new String[2];
            input = sc.readLine().split(" ");
            
            long n = Long.parseLong(input[0]);
            long k = Long.parseLong(input[1]);

           
          String  arr[] = new String[(int)n];
          arr= sc.readLine().split(" ");


   while(k -->0){
String [] inner = new String[2];
inner = sc.readLine().split(" ");
int a = Integer.parseInt(inner[0]);
int b = Integer.parseInt(inner[1]);

long sum =0;
for(int i=a;i<=b;i++){
sum+=Long.parseLong(arr[i-1]);
}
System.out.println(sum);
}








        
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
