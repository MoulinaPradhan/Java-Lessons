import java.io.IOException;

class prob1{
    int puzze(int n){
        int result;
        if(n ==1)return 1;
        result = puzze(n-1)*n;
        return result;

}}
public class t{
    public static void main(String[] args)throws Exception {
    prob1 f = new prob1();
    System.out.println(f.puzze(6));
    }
}