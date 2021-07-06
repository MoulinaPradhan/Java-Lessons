

public class Fibonacci {
  public static int FibMemorized(int n , int []qb){
    if(n == 0 || n == 1){
        return n;
    }

    if( qb[n] != 0 ){
        return qb[n];
    }

    int fibnm1 = FibMemorized(n-1, qb);
    int fibnm2 = FibMemorized(n-2, qb);

    int fibn = fibnm1 + fibnm2;
    qb[n] = fibn;
    return fibn;

  } 
  
  public static void main(String[] args) {
      int n=10;
      int qb[] = new int [n+1];
      System.out.println(FibMemorized(n, qb));
  }
}
