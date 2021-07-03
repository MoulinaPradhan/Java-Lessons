
import java.util.*;

public class MaximumSumLessThanK {
    public static void main(String[] args) {
        int arr[] = {1,4,9,-10,4};
        int k =7;
        System.out.println(find(arr,k));
    }

    public static  int find(int []sum, int k){
        int result = Integer.MIN_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int prefixSum =0;
        for(int i=0;i<sum.length;i++){
            prefixSum+= sum[i];
            Integer target = set.ceiling(prefixSum-k);

            if(target != null){
                result = Math.max(result, prefixSum-target);
            }
            set.add(prefixSum);
        }
        return result;
    }
}
