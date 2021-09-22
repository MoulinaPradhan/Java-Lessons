/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class oldSaint
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            
             String[] qs = new String[3];
           qs = sc.readLine().split(" ");
            
           String[] ans = new String[3];
          ans = sc.readLine().split(" ");

          int q1=0,ans1=0,ans0=0,q0=0;

for(int i=0;i<3;i++)
{
    if(qs[i].equals("1")){
        q1++;
    }
    else 
        q0++;
}  


for(int i=0;i<3;i++)
{
     if(ans[i].equals("1")){
        ans1++;
}else{
    ans0++;
}        
}
System.out.println(q1+" "+ans1+" "+q0+"  "+ans0);
  if(q1==ans1 && q0==ans0){
      System.out.println("Pass");      
  }else{
      System.out.println("Fail");
  }

        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
