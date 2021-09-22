/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class SayNoDrugs
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
            int K =  Integer.parseInt(input[1]);
             int L = Integer.parseInt(input[2]);
            
      


            String[] speed = new String[N];
            speed = sc.readLine().split(" ");
            
          boolean flag = say(N, K, L, speed);


if(flag){
    System.out.println("Yes");
}
 else{
     System.out.println("No");
 }       



        }
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }

 public static boolean say(int N,int K,int L,String[] speed){

    if(K<0)return false;
if(L<=0)return false;
int max=0,fri=0;
for(int i=0;i<N;i++){
max = Math.max(max,Integer.parseInt(speed[i]));
fri= Integer.parseInt(speed[i]);
}



int drug =fri;
while(drug<max){
    drug = drug+K;
    if(drug>=L) return false;

}


        return true;
    }
}
