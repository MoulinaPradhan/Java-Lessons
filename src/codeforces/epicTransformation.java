package src.codeforces;

import java.util.*;

public class epicTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     Set<Integer> set = new HashSet<>();
   
     while(t --> 0){
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
       System.out.println(count(set.size(), n));

      

     } 
    }
    public static int count(int size,int n){
        if(size ==1) return n;
        return n%2;
    }
}
