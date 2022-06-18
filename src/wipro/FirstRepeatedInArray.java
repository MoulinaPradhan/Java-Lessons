import java.util.*;

public class FirstRepeatedInArray {
    public static void main(String[] args) {
        int arr[]={-1,-2,-4,-8};
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int n:arr){
            if(set.contains(n) && n >0) return n; 
            set.add(n);
        }
        boolean flg =false;
        for(int n:arr){
            if(n>0) flg=true;
        }
      if(flg ==true)return arr[0];
return 0;
    }
}
