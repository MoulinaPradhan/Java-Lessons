package Patterns;

//     *
//    **
//   ***
//  ****
// *****

public class p6 {
    public static void main(String[] args) {
        fn6(5, 0, 5);
    }
    public static void fn6(int r, int c, int n){
        if(r==0) return;
        if(c<n){
            if(c< n-((n-r)+1))
            System.out.print(" ");
            else System.out.print("*");
            fn6(r, c+1, n);
        }
        else{
            System.out.println();
            fn6(r-1, 0, n);
        }
      
    }
}
