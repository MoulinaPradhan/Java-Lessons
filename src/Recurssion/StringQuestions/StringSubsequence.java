package StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {
    public static void main(String[] args) {
        // st("","abc");
        int arr[] ={1,2,3};
        System.out.println(subset(arr));
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
    }

