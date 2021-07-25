package July;
import java.util.*;
import java.io.*;

public class SumOfDigitsStringAfterConvert {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        int k =Integer.parseInt(sc.readLine());
        System.out.println(solve(s, k));
}

    public static int  solve(String s, int k) {

        String num ="";
        for(int i=0;i<s.length();i++){
            num+= Integer.valueOf(s.charAt(i)-'a'+1);
        }
        int sum =0;
        while(k-->0){
            sum=0;
            for(int i=0;i<num.length();i++){
            sum += Character.getNumericValue(num.charAt(i));
            }
            num = Integer.toString(sum);
        }

        return sum;
}
}