package Patterns;

// * * * * 
// * * * *
// * * * *
// * * * *


public class p2 {
    public static void main(String[] args) {
        fn2(4, 0, 4);
    }
public static void fn2(int r, int c, int t){
if(r==0) return;
if(c<t){
    System.out.print("* ");
    fn2(r, c+1,t);
}else{
    System.out.println();
    fn2(r,0, t);
}

    }
}
