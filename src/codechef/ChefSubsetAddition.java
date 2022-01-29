/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class ChefSubsetAddition
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int N = Integer.parseInt(input[0]);
          int X =  Integer.parseInt(input[1]);
           int Y= Integer.parseInt(input[2]);
            
           String [] A=new String[N];
           A= sc.readLine().split(" ");

           String [] B = new String[N];
           B= sc.readLine().split(" ");

          boolean flag =true;
           for(int i=0;i<N;i++ ){
               int num = Integer.parseInt(B[i])-Integer.parseInt(A[i]);
               if((num !=X && num != Y)){
         
                   flag = false;
                   break;
               }
           }

           if(flag){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
