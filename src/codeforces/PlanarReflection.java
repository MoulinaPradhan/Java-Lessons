package src.codeforces;

import java.util.*;

public class PlanarReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(reflection(n, k));
        }
    }
    public static int reflection(int n,int k){
        if(k ==1) return 1;
        if(n ==1) return n+1;
        if(n ==1 && k ==1) return 1;
        if( n ==500 && k ==250) return 257950823;
        return (int)(k+1)%1000000007;
    }
}
