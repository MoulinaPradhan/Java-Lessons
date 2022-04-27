// https://practice.geeksforgeeks.org/problems/killing-spree3020/1#


public class KillingSpree {
   public static void main(String[] args) {
      System.out.println(killinSpree(10)); 
   } 
  static long killinSpree(long n)
   {
      
    long ans = fn(n,1,0);
      return ans;
   }
 static  long fn(long n, long i, long c){
     if(n ==(i*i)) return c+1;
       if(n<= (i*i)) return c;
      return fn(n-(i*i),i+1,c+1);
   }
}
