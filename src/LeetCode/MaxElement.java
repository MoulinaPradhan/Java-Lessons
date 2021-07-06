
import java.util.*;


public class MaxElement {
    public static void main(String[] args) {
        int nums[]={1,5,4,5};
        int i=0;
        int j=i+1;

        List<Integer> al = new ArrayList<>();

        while(i<nums.length){
        if(j != nums.length){
           int pro =(nums[i]-1)*(nums[j]-1);
        //    System.out.println(i + "  "+j);
           al.add(pro);
           j++;
        }
        else{
        i++;
        j=i+1;
        }
        
        }

// System.out.println("-------");
//         for(int w: al)System.out.println(w);
      int m=  Collections.max(al);
      System.out.println(m);

    }
}
