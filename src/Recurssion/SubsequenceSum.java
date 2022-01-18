// Print any 1 subsequence whose sum == given sum
import java.util.*;



public class SubsequenceSum {
    public static ArrayList<ArrayList<Integer>>list = new ArrayList<>();
    public static int arr[] = {1,1,2};
    public static int target=2;
    public static void main(String[] args) {
        f(0,new ArrayList<>(),0);
  
    System.out.println(list);
}
public static boolean f(int i,ArrayList<Integer>path,int sum){
    if(i>=arr.length){
        //condition satisfied
        if(sum ==target){
        list.add(new ArrayList<>(path));
        return true;
       
    }
    return false;
}
    path.add(arr[i]); //pick
    if(f(i+1,path,sum+arr[i]) ==true)return true;
    path.remove(path.size()-1); //not pick
    if(f(i+1,path,sum-arr[i]) == true) return true;
    return false;
}
}
