package Patterns;

public class p8 {
    public static void main(String[] args) {
        // System.out.println("  *");
        // System.out.println(" ***");
        // System.out.println("*****");

  fn8(3, 0,1);
    }
    public static void  fn8(int r, int c, int n){
if( r==0) return ;
    if(c<2*n+1){
    if(c< -1)
    System.out.print(" ");
    else
    System.out.print("*");
    fn8(r, c+1,n);
}
else{
    System.out.println();
    fn8(r-1, 0,n+1);
}
    }
}
