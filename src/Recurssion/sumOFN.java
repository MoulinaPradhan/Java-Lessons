public class sumOFN {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    static int sum(int n){
        if(n<1) return 0;
        return n+sum(n-1);
    }
}
