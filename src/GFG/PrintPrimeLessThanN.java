// https://www.geeksforgeeks.org/print-all-prime-numbers-less-than-or-equal-to-n/

public class PrintPrimeLessThanN {
    public static void main(String[] args) {
        
        int n =13;

    for(int i=2;i<=n;i++){
        if(isPrime(i))System.out.print(i+" ");
    }
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2 ==0 || n%3==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
