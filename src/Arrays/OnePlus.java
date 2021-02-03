package src.Arrays;
import java.util.*;

public class OnePlus {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        String s ="";
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<arr.length;i++){
            s=String.valueOf(arr[i]);
            sb.append(s);
           
        }
        int m=Integer.parseInt(sb.toString());
        // System.out.println(sb.toString());
        System.out.println(m+1);
    }
}
