package StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {
    public static void main(String[] args) {
        // st("","abc");
        int arr[] ={1,2,3};
        fn(arr,new ArrayList<>());
        System.err.println(res);

        // System.out.println(subset(arr));
        // System.out.println(subsetDuplicate(arr));
    }
    static void st(String ans, String og){
        if(og.isEmpty()) {
            System.out.println(ans);
            return;
        }
        st(ans+og.charAt(0), og.substring(1));
        st(ans, og.substring(1));
    }
    //Iterative 
    static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;    
        
    }
// remove Duplicates
    static List<List<Integer>> subsetDuplicate(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal))
                outer.add(internal);
            }
        }
        return outer;    
        }
     static   List<List<Integer>>res = new ArrayList<>();
    // permutaion backtracking
    public static void fn(int [] nums,List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            System.out.println(res);
            return;
        }
        for(int i=0;i<nums.length;i++){
                if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            fn(nums,curr);
            curr.remove(curr.size() -1);
        }
    }
}

