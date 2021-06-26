
import java.util.*;

public class PairsDivisible {
    public static int count4Divisibiles(int arr[], int n ) {
        int [] freq=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
           
            int rem = arr[i] % 4;
 
            // Count number of ( A[i], (K - rem)%K ) pairs
           sum+= freq[(4 - rem) % 4];
   
            // Increment count of remainder in hash map
            freq[rem]++;
            
        }
        
        
        return sum;
    }
    public static void main(String[] args) {
     int n=5;
     int arr[]={20,16,11,16,14};
   System.out.println(count4Divisibiles(arr, n));
    }
}
