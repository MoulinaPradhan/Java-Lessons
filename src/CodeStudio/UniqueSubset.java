import java.util.*;
public class UniqueSubset {

    public static void main(String[] args) {
        int nums[] ={1,2,2};
        System.out.println(uniqueSubsets(nums.length, nums));
        
    }
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int nums[]) {
      fn(nums,0,new ArrayList<>());
      Collections.sort(res,(a,b)->a.size()-b.size() );
		return res;
    }
	 public static  void fn(int[] nums, int idx, List<Integer> curr){
         if(!res.contains(new ArrayList<>(curr)))
        res.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            fn(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}



