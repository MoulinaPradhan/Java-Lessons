/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class SleepCycle
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

         int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
          String[] input = new String[3];
            input = sc.readLine().split(" ");
            
          int l= Integer.parseInt(input[0]);
          int h =  Integer.parseInt(input[1]);
          String s =input[2];
        
       
      System.out.println("helper  "+helper(s,h));
         
      

 


         

        }
      
     
	 sc.close(); 
     
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
    private static String helper(String s,int b) {
    String arr[] = s.split("1");
    if(arr.length ==0) return "NO";
    for(String e : arr)System.out.println(e);

  long sum = arr[0].length();
  if(sum == b) return "YES";
 for(int i=1;i<arr.length;i++){
   if(arr[i].length() == 2*(b-sum)) return "YES";
 }
    return "NO";
    }

}
