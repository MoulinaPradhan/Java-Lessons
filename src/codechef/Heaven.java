package src.codechef;
import java.util.*;

public class Heaven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
            int L = sc.nextInt();
            String S = sc.next();
           System.out.println(heaven(L,S));
         
        }
    }
        public static String heaven(int L, String S){
            int count =0;
            for(int i=0;i<L;i++){
                if(S.charAt(i) == '1')count++;
            }
            if(L == 4 && count >=1) return "YES";
            int result = (count*100)/L;
            if(result >= 50){
            return "YES";
            }
        
        return "NO";
        }
    }

