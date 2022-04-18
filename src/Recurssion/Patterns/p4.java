package Patterns;


    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

public class p4 {
    public static void main(String[] args) {
        fn4(9, 0, 1,9/2);
    }
    public static int n=9;
    public static void fn4(int r, int c, int t,int n){
    if(r ==0) return;
    
    if(c<t){
        System.out.print("* ");
        if(n>=r)fn4(r, c+1, r, n);
       else fn4(r, c+1, t, n);
       
    }
   
       else{
        System.out.println();
        fn4(r-1, 0, t+1,n);
    }
   
    }
}
