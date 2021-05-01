package src.codechef;
import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int N = sc.nextInt();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long anu=0; long sar=0;
            while(N -->0){
                String S = sc.next();
                if(S.charAt(0) == 'E' || S.charAt(0) == 'Q' || S.charAt(0) == 'U' || S.charAt(0) == 'I' || S.charAt(0) == 'N' || S.charAt(0) == 'O' || S.charAt(0) == 'X' ){
                    sar+=A;
                }else anu +=B;
            }
            // System.out.println(anu + "anu" + sar +" sar");
            if(anu == sar){
                System.out.println("DRAW");
            }
            if(anu > sar){
                System.out.println("ANURADHA");
            }
            if(sar> anu)
                System.out.println("SARTHAK");
            
        }
    }
} 