import java.util.*;
public class MaxProfit {
    public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
        // sc.nextLine();
		// String arr[] = new String [n];
		// arr = sc.nextLine().split(" ");
        // int max =Integer.MIN_VALUE,min =Integer.MAX_VALUE;
		// for(int i=0;i<n;i++){
        //     int num = Integer.parseInt(arr[i]);
        //   min = Math.min(num,min);
        //   max = Math.max(max,num- min);
		// }

        // System.out.println(max);
        long j[] ={100 ,180 ,260 ,310 ,40 ,535 ,695};
        System.out.println(getMaximumProfit(j.length, j));
	}

    public static long getMaximumProfit (int n, long[]  arr) {
        long max =Integer.MIN_VALUE,min =Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
         long num = arr[i];
           min = Math.min(num,min);
           max = Math.max(max,num- min);
         }
         return max;
     }
}

