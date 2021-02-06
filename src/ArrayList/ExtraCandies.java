package src.ArrayList;
import java.util.*;

public class ExtraCandies {
    public static void main(String[] args) {
        int candies[] = {4,2,1,1,2}, extraCandies = 1;

        ArrayList<Integer> al = new ArrayList<>();
ArrayList<Boolean> res = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            al.add(candies[i]);
        }
        int max = Collections.max(al);

        for(int i =0;i< candies.length;i++){
            if(candies[i] + extraCandies >= max){
res.add(true);
            }else{
                res.add(false);
            }
        }



        for(Boolean c: res) System.out.println(c);
    }
}
