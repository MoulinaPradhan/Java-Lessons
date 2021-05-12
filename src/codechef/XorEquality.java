import java.util.*;

public class XorEquality {
  
    public static int mode = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t --> 0){
            long N = sc.nextInt();
            System.out.println(helper(N));
        }
    }
    public static int helper(long N){
        int sum =0;
        for(long i=0;i< Math.pow(2, N);i++){
        
         long a = (i ^ (i+1))%mode;
         long b = ((i+2) ^ (i+3))%mode;
         if( a == b){
          sum++;
         }

 }  
        
        return sum%mode;
    }
}
