package Patterns;

// ****
//  ***
//   **
//    *

public class p7 {
    public static void main(String[] args) {
        fn7(5, 0, 5);
    }
    public static void fn7(int r, int c, int n){
        if(r==0) return;
        if(c<n){
            fn7(r, c+1, n);
            if(c<(n-r))
            System.out.print("*");
            else System.out.print(" ");
           
        }
        else{
           
            fn7(r-1, 0, n);
            System.out.println();
           
        }
      
    }
}


