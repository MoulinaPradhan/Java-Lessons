
import java.util.*;
import java.lang.*;
import java.io.*;

public class SpecialFibonnaci {
    public static void main(String[] args) throws java.lang.Exception {
        try {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int  t =  Integer.parseInt(sc.readLine());
            while(t --> 0){
                String ip[] = new String[3];
                ip = sc.readLine().split(" ");
                int a = Integer.parseInt(ip[0]);
                int b = Integer.parseInt(ip[1]);
                int c = Integer.parseInt(ip[2]);
                System.out.println(fib(a,b,c));

            }
            sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
    }
    public static  int fib(int a,int b,int n){
if(n == 0) return a;
else if( n==1) return b;
else if(n ==2) return a ^ b;
return fib(a,b,n%3);
    }
}
