
import java.util.*;

public class DoubleValue {

    public static long solved(int n, long A[], long b)
    {
        long newb=1;
        for(int i=0;i<A.length;i++){
            if(A[i]==b){
               b=2*b;
}
        }
        return b;
    }
    

    public static void main(String[] args) {
        int n=5; long b = 2;
        int A[] = {1, 2 ,3, 4 ,8};  
        // System.out.println(solved(n, A, b));
    }
}
