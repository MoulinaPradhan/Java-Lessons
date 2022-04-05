public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(30402));
    }
    public static int z=0;
    public static int count(int n){
    if(n ==0) return z;
    if(n %10 ==0) z++;
    return count(n/10);
    }
}
