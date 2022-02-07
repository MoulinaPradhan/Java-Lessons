import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int arr[]={2 ,-3 ,3 ,3 ,-2};
        pairSum(arr, 0);
    }

    public static int[][] pairSum(int[] arr, int s) {
      ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == s)
                    list.add(new int[]{arr[i],arr[j]});
            }
        }
        
        int num[][] = new int [list.size()][2];
        for(int i=0;i<list.size();i++){
            num[i][0] = list.get(i)[0];
            num[i][1] = list.get(i)[1];
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i][0]+ " "+num[i][1]);
        }
        return num;
    }
}

