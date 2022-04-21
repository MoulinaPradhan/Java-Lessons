public class findPrime {
    public static void main(String[] args) {
        int n = 11;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0) System.out.println(false);
        }
        System.out.println(true);

        System.out.println(prime(2, 49));
    }
    static boolean prime(int i, int n){
        if(i == n)return true;
        if(n %i ==0) return false;
      
      return  prime(i+1, n);
    }
}
