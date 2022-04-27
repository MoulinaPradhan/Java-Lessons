package StringQuestions;

public class KthSymbol{
public static void main(String[] args) {
    System.out.println(fn(2,2));
}
public static int  fn(int n, int k){
    if(n ==1) return 0;
   if(k%2==0) return (fn(n-1,k/2) == 0) ? 1: 0;
   else return (fn(n-1,(k+1)/2) == 0) ? 0:1;
}
}