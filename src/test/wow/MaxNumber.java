package wow;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int max =Integer.MIN_VALUE;int ans =0;
        for(int i=1;i<=m;i++){
            if(fn(i,0)> max){
            max= fn(i,0);
            ans =i;

            }
          
        }
System.out.println(ans);
    }
    public static int fn(int n,int c){
        if(n==1) return c;
        if(n%2==0) return fn(n/2,c+1);
        else return fn(3*n+1,c+1);
    }
}
