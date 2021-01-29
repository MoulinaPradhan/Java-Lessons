package src.LeetCode;
import java.util.*;

public class CityDestination {
    public static void main(String[] args) {

        String paths[][] = { {"B","C"}, {"D","B"},{"C","A"}};
Set<String> ans= new HashSet<>();
       
        for (int i=0;i<paths.length;i++){
           ans.add(paths[i][1]);
           if(ans.contains(paths[i][0])){
              ans.remove(paths[i][0]);
           }
        }
System.out.println(ans);

    }
}
