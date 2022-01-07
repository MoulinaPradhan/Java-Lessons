public class BasicBacktrack {
  public static void main(String[] args) {
      f(10,10);
      fe(1,10);
  }  
  // 1- N
  public static void f(int i,int n){ //paramaterized way
      if(i<1) return;
      f(i-1,n);
      System.out.println(i);

  }
  public static void fe(int i,int n){
      if(i>n) return;
      fe(i+1,n);
      System.out.println(i);
  }
}
