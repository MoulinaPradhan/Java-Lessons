import java.util.*;

public class MatchDay {
    public static void main(String[] args) {
        int N=9;
        int K=3;
        int arr[] = {1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};
        System.out.println(max_of_subarrays(arr, N, K));
    }
    public static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
       ArrayList<Integer> res = new ArrayList<>();
    ArrayDeque<Integer> q = new ArrayDeque<>();

int len =0;
for(int i=0;i<arr.length;i++){
q.push(arr[i]);

len++;
int max=0;

if(len ==k){
    for (Integer number :q) {
      max = Math.max(number, max);
      
     }
     res.add(max);
    q.removeLast();
// q.removeFirst();
len--;
}


}
       return res;
    }
}
