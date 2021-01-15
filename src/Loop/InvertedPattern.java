package src.Loop;

public class InvertedPattern {
   public static String[] invIsoTriangle(int N) {
      String hi[]=new String[N];
      for(int i=1;i<=N;i++){
          for(int j=1;j<=i;j++){
            System.out.println("*");
            hi[i]+="*";
          }
      
      }
    return hi;
    }
    public static void main(String[] args) {
        int N=3;
System.out.println(invIsoTriangle(N));
    }
}
