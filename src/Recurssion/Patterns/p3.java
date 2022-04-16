package Patterns;

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

public class p3 {
    public static void main(String[] args) {
        fn3(5, 5);
    }
    public static void fn3(int r, int c){
        if(r==0) return ;
        if(c>=1){
            fn3(r,c-1);
            System.out.print(c+" ");
          
        }else{
             fn3(r-1, r-1);
            System.out.println();
        }
        

    }
}
