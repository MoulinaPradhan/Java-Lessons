

import java.util.Scanner;

public class SetBitsSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n){
        if(n==0){
            return 0;
        }
        int x=largestPowerOf2(n);
        int btill2x=x * (1<< (x-1));
        int mb2ton=n-(1<< x)+1;
        int rest=n-(1<<x);
        int ans= btill2x+mb2ton+solution(rest);
        return ans;


    }
    public static int largestPowerOf2(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
     return x-1;
    }
}
