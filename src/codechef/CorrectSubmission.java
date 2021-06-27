/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class CorrectSubmission
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] input = new String[1];
            input = sc.readLine().split(" ");
            
          int n = Integer.parseInt(input[0]);
          String s = sc.readLine();
          String arr[] = s.split("\\s");
          
        Map<String,Integer> map = new HashMap<>();
       
        for(int i=1;i<arr.length;i+=2){
         map.put(arr[i-1], Integer.parseInt(arr[i]));
        }
 
       System.out.println(map);
       List<Integer> list = new ArrayList<>(map.values());
       Collections.sort(list); 
 for(int i=0;i<list.size();i++){
System.out.print(list.get(i)+ " ");
}


        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
    
}
