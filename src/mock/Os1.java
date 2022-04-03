
import java.util.*;
import java.lang.*;
import java.io.*;

public class Os1 {
   public static void main(String[] args)  throws java.lang.Exception {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));


    int  N =  Integer.parseInt(sc.readLine());
    int arr[] = new int [N];
    int count =0,sum =0;
    for(int i=0;i<N;i++){
       arr[i] =Integer.parseInt(sc.readLine());
    }
    Arrays.sort(arr);
    int res=arr[0];
    for(int i=0;i<arr.length;i++){
       if(Arrays.asList(arr).contains(arr[0])){
count++;
if(count>=1)sum+=arr[0];
       }
    }
    System.out.println(sum);
   }
}