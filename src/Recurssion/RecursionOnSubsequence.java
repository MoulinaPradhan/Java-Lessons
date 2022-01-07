import java.util.ArrayList;

public class RecursionOnSubsequence {
    // Subsequence :- a contigous/non-contigous sequence,which follows the order.

    public static ArrayList<ArrayList<Integer>>list = new ArrayList<>();
    public static int arr[] = {3,1,2};
    public static void main(String[] args) {
        f(0,new ArrayList<>());
        for(ArrayList<Integer>e:list){
            System.out.println(e);
        }
    
}
public static void f(int i,ArrayList<Integer>path){
    if(i>=arr.length){
        list.add(new ArrayList<>(path));
        return;
    }
    path.add(arr[i]); //pick
    f(i+1,path);
    path.remove(path.size()-1); //not pick
    f(i+1,path);
}
//TC:-  O(2^n)  *    O(n)
            //    (for loop)      

            // SC:- O(n) the depth of the recursion tree can be of the size of arr
}
// no of subsequence :- 2^n = 2^3 =8