package src.codechef;
import java.util.*;

public class StrongLanguage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int T= sc.nextInt();

        while(T --> 0){
int N = sc.nextInt();
int K = sc.nextInt();
String S = sc.next();
System.out.println(runner(N, K, S));
        
}
    }

    public static String runner(int N,int K, String S){
        String ans = "NO";
        int sum =0;
        if(!S.contains("*"))return ans;
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1) == S.charAt(i) && S.charAt(i-1) == '*'){
               sum+=2;
            }
        }
        if(sum == K){
            ans="YES";
            return ans;
        }
        return ans;
    }
}