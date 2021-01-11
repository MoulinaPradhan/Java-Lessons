package src.Recurssion;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2){
            return n;
        }
    
        int num = 1;
        int old = 1;
        int replacer = 0;
    
        for (int i = 2; i <= n; i++) {
            replacer = old;
            old = num;
            num += replacer;
        }
        return num;
    } 
    public static void main(String[] args) {
        int n=4;
        System.out.println(climbStairs(n));
    }
}
