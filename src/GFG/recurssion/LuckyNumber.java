package recurssion;
import java.io.*;

public class LuckyNumber {
    public static void main(String[] args) throws IOException {
       BufferedReader sc= new BufferedReader(new InputStreamReader(System.in)) ;
       int n = Integer.parseInt(sc.readLine());
       System.out.println(isLucky(n));
    
    }
    public static boolean isLucky(int n){
        return check(n,2);
    }
    public static boolean check(int n,int counter)
    {
    if(counter<=n){
    if(n%counter==0)
    return false;
    
    n=n-n/counter;
    counter++;
    
    return check(n, counter);
    }
    else
    return true;
    }
    }