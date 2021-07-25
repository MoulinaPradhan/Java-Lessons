import java.util.ArrayList;
import java.util.Collections;

public class taxPay {
public static void main(String[] args) {

}

public static ArrayList<Integer>B = new ArrayList<>();
public static int   solve(ArrayList<Integer> A){
      for(int e: A){
          if(isPrime(e)){
              B.add(e);
          }else{
        B.add(e/(printDivisors(e)));
          }
        }
Collections.sort(A);
Collections.sort(B);

int max = 0;
for(int i = 0; i < A.size(); i++){
    max+=A.get(i)*B.get(i);

    }
    return max;
}
public static int  printDivisors(int n)
    {
        int max =0;
        for (int i=1;i<=n;i++)
            if (n%i==0){
                System.out.print(i+" ");
                max = Math.max(i,max);
            }
       return max;       
    }
 
   public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}
