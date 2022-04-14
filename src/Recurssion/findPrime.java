public class findPrime {
    public static void main(String[] args) {
        int n = 11;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0) System.out.println(true);
        }
        System.out.println(false);
    }
}
