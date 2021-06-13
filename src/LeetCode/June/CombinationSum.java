package June;
import java.util.*;



public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("Combination Sums are: ");
       int candidates []= {2,3,6,7};
         int target = 7;
       combinationSum(candidates,target);
         System.out.println(res);
    }

    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
if(candidates.length==0|| candidates ==null) return res;
  find(0, target, 0, new ArrayList<>(), candidates);
return res;
    }
    public static void find(int sum,int target,int index,List<Integer> sub, int [] candidates){
     if(sum == target){
         res.add(new ArrayList<>(sub));
         return ;
     }
     for(int i=index;i<candidates.length;i++){
         if(sum+candidates[i] <=target){
             sub.add(candidates[i]);
             find(sum+candidates[i], target, i, sub, candidates);
             sub.remove(sub.size()-1);
         }
     }
     return;
    }
}
