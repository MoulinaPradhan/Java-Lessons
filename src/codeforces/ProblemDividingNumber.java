import java.util.*;
import java.lang.*;
import java.io.*;



public class ProblemDividingNumber {
    public static void main(String[] args) {
        
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

   int  t =  Integer.parseInt(sc.readLine());

       while(t --> 0){
           
           String[] input = new String[3];
           input = sc.readLine().split(" ");
           
         int a = Integer.parseInt(input[0]);
         int b =  Integer.parseInt(input[1]);
         int k = Integer.parseInt(input[2]);
         
         int diff = b-a;
         if(diff == 0 || diff %k !=0){
             System.out.println("NO");
         }
         else{
            System.out.println("YES");
         }
        
        

 
       }
           
     sc.close();      
       } catch(Exception e) {
     return;
       }
     
      
    
   
   }
}
  


