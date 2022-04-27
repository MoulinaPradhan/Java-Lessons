public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(c(12,1,0));
    }
    public static int c(int n, int i,int max){
        if(n ==0)return 0;
        if(n ==1) return 1;
        if(i*i > n) 
        return c( (n/(i*i)),i+1,max+1);
        
    }
}
