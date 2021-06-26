

import java.util.ArrayList;
import java.util.*;
public class WealthPerson {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
        ArrayList<Integer> l=new ArrayList<>();
  
        // for (int i = 0; i < 2; i++) 
        //     for (int j = 0; j < 2; j++) 
        //         System.out.println("arr[" + i + "][" + j + "] = "
        //                            + arr[i][j]); 

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                System.out.println("arr[" + i + "][" + j + "] = "
                                           + arr[i][j]); 
                    sum=sum+arr[i][j];
            }
          System.out.println(sum);
          l.add(sum);
        }

for(int e:l)System.out.println(e);
System.out.println("max"+Collections.max(l));
    }
}
