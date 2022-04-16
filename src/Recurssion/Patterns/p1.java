package Patterns;

public class p1 {
    public static void main(String[] args) {
       fn(4);
       tri(4, 0);
    }
    public static void fn (int n){
        if(n==0) return;
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        fn(n-1);
    }
    // another way
    public static void tri(int r, int c){
        if( r ==0) return ;
        if( c <r){
            tri(r, c+1);
            System.out.print("* ");
           
        }else{
            tri(r-1, 0);
            System.out.println();
           
        }
    }
}
