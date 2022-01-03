/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class IntegerityDiversity
{
	public static void main (String[] args) 
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
            int n= Integer.parseInt(sc.readLine());
             String[] input = new String[n];
            input = sc.readLine().split(" ");
      Map<String,Integer>map= new HashMap<>();
      for(int i=0;i<input.length;i++){
        int m=Integer.parseInt(input[i]);
if(m<0){
  m=-(m);
  map.put(String.valueOf(m),map.getOrDefault(String.valueOf(m),0)+1);
}else
        map.put(input[i],map.getOrDefault(input[i],0)+1);
      }
  int c =0;
  for(Map.Entry<String,Integer>e:map.entrySet()){
    if(e.getKey().equals("0"))c++;
   
    else{
      if(e.getValue()==1)c++;
      else if(e.getValue()>1)c+=2;
    }
  }

System.out.println(c);
        }
	       
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
