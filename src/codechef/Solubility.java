import java.util.*;


public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int res = A + (100 - X)* B ;
            System.out.println(res * 10);
            System.out.println(2 ^ 3);
        }
    }
}
