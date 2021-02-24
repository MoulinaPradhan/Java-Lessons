package src.Arrays;
import java.util.*;

public class MergeRange {
public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    int queries[] = {0, 2, 1, 3};
    int q=3;
    ArrayList<Integer> ans = new ArrayList<>();

    int pre[] = new int[arr.length];
    pre[0] = arr[0];
    for(int i=1;i<arr.length;i++){
        pre[i] = pre[i-1]+arr[i];
    }

    int i=2;
    while(i != queries.length-2){
        int bi = i, ei=bi+1;
        //0,2
         int sum = pre[queries[ei]] - arr[queries[bi]-1];
            System.out.println(sum + "queries[ei]"+queries[ei]+"  queries[bi]  "+queries[bi]);
         i=ei+1;
         ei=i+1;
        
       
    }

  
}    
}
