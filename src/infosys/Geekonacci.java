public class Geekonacci {
    public static void main(String[] args) {
        System.out.println(gn(1,3,2,4));
    }
    public static int gn(int a,int b,int c,int n){
        int d = a+b+c;
        n = n-1;
        if((n-3) == 0) return d;
        return gn(b,c,d,n);
    }
}
