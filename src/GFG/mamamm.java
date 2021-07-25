public class mamamm {
   public static void main(String[] args) {
       int A=7;
       int B=1;
    System.out.println(solve(A, B));
   } 
   public static int solve(int A, int B) {
    if(A==0 || B==0)return B;
    if(A!=0 && B==0)return A;
    if(A==B)return A;
    // if(Math.abs(A-B)== 1)return 1;
   
// System.out.println(solve(A,Math.abs(A-B))+"  h");
// System.out.println(Math.abs(A-B)+"  abs");
     if(A<B)
  return (Math.min( Math.abs(A-B),solve(A,Math.abs(A-B))))%1000000007 ;

  return (Math.min( Math.abs(B-A),solve(B,Math.abs(B-A))))%1000000007 ;

}
}

