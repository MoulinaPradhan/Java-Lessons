import java.util.*;

/* to keep the ed amd md same 
we get condition 
x1=x2 Or y2=y1

*/
public class PairsOfCoinciding {
   public static void main(String[] args) {
    int X[] ={1,2,1};
    int Y[] = {2,3,3} ;
    
    System.out.println(numOfPairs(X, Y, 3));

   } 
   static int numOfPairs(int[] X, int[] Y, int N) {
    Set<String>set = new HashSet<>(); 
     for(int i=1;i<N;i++){
         int mh = Math.abs(X[i]-X[i-1])+ Math.abs(Y[i]-Y[i-1]);
     int ed =(int)Math.pow(((Math.pow(X[i]-X[i-1],2) + (Math.pow(Y[i]-Y[i-1],2)))),0.5); 
    if(ed == mh) {
     String ans =   String.valueOf(X[i])+  String.valueOf(Y[i]);
     String b=  String.valueOf(X[i-1])+  String.valueOf(Y[i-1]);
     set.add(ans);
     set.add(b);
    }
     }
     System.out.println(set);
     return set.size();
 }
}
