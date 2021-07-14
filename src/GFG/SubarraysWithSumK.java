import java.util.*;
import java.io.*;

public class SubarraysWithSumK {
    public static void main(String[] args) throws IOException {
BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)) ;       
int n = Integer.parseInt(sc.readLine());
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i] = Integer.parseInt(sc.readLine());
}
int k = Integer.parseInt(sc.readLine());
System.out.println(findSubArraySum(arr, n, k));
}
public  static int findSubArraySum(int nums[], int N, int k){
    int count=0;
    int sum=0;
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
sum+=nums[i];
if(sum == k){
    count++;
}
if(map.containsKey(sum-k)){
    count+= map.get(sum-k);
}
map.put(sum,map.getOrDefault(sum,0)+1);
    }
    //map
    // System.out.println(map);
    return count;
}
}
