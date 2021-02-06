package src.ArrayList;

import java.util.*;

public class CheckStraightLine {
    public static void main(String[] args) {
        int coordinates [][]={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=1;i<coordinates.length;i++){
          

           
           System.out.println(coordinates[i-1][1] +"  " + coordinates[i][0]);
         map.put(coordinates[i][1] , coordinates[i][1]);
       
    }
        System.out.println(map);

    }
}
