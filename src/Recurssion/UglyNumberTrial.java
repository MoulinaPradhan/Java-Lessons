import java.util.*;

public class UglyNumberTrial {
  public static void main(String[] args) {

    System.out.println(loop(1, 11, 0));  
      System.out.println(list.get(list.size()-1));
  }
    public static List<Integer> list  = new ArrayList<>();
    public static int loop(int st, int t, int c){
      if(c==t) return st-1;
      else if(fn(st,st))return loop(st+1, t, c+1);
      return loop(st+1, t, c);
    } 
    public static boolean fn(int n, int og){
        if(n <= 1){
          list.add(og);
        return true;
        }
  else   if(n%2==0){
    return fn(n/2,og);
        }
   else  if(n%3==0)
   return   fn(n/3, og);
     else  if(n%5 ==0)
     return fn(n/5, og);
        return false;
    
    }
}
