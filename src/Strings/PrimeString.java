// don't place package name! */

/*June*/

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class PrimeString
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
           
          String  input = sc.readLine();
      
    char arr[] = input.toCharArray();
    int odd=0,even=0;
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            odd +=(int)arr[i];
        }else{
            even +=(int)arr[i];
        }

    }

//  System.out.println(odd+" "+even);

int diff = Math.abs(odd-even);

if(diff%3==0 || diff%5==0 || diff%7==0){
    System.out.println("Prime String");
}else{
    System.out.println("Casual String");
}




        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
