import java.util.*;



import java.io.*;

public class GeekonacciNumber {
public static void main(String[] args) throws java.lang.Exception {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(sc.readLine());
 while(t-->0){
     String input[] = new String[4];
     input= sc.readLine().split(" ");
     int a = Integer.parseInt(input[0]);
     int b = Integer.parseInt(input[1]);
     int c = Integer.parseInt(input[2]);
     int n = Integer.parseInt(input[3]);
     System.out.println( geekonacci(a,b,c,n));    
   }
}


public static int geekonacci(int a, int b,int c,int d){

    if(d ==0) return 0;
    if(d==1) return a;

    if(d==2) return b;
    if(d==3) return c;
    
    
    return geekonacci(a, b, c, d-1)+geekonacci(a, b, c, d-2)+geekonacci(a, b, c, d-3);
}
}
