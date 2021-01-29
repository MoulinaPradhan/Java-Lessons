package src.LeetCode;
import java.util.*;
public class AssignCookies {
   public static void main(String[] args) {
       
    int g[]={10,9,8,7,10,9,8,7};
    int s[]={10,9,8,7};

    Arrays.sort(g);
    Arrays.sort(s);
    int child = 0;
    int cookie =0;
    while (child < g.length && cookie < s.length) {
        if (g[child] <= s[cookie]) {
        child++;
        }
        cookie++;
    }
    System.out.println(child);

   } 
}
