import java.util.*;
public class FuNinja {
 public static void main(String[] args) {
    int[][] dishes ={{30, 10},{30,20},{30,30}};
    int t=60;
    System.out.println(deliciousNinja(dishes.length, t, dishes));
 }   
 public static int deliciousNinja(int n, int t, int[][] dishes) {
    Arrays.sort(dishes,(a,b) -> b[1]-a[1]);
 int first=0;
int d=0;
 for(int i=0;i<n;i++){
     if(i==0 && dishes[i][0] > t) first = dishes[i][1];
    else if(t>= dishes[i][0]){
        d +=dishes[i][1];
        t=t-dishes[i][0];
     }
     if( t==0) return d;

 }

		return first+d;
    }
}
