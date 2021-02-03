package src.LeetCode;
import java.util.*;

public class PathCrossing {
    public static void main(String[] args) {
      String path="NESWW";
   
    }
    public boolean isPathCrossing(String path) {
        
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int x = 0, y = 0;
        map.put(0, new HashSet());
        map.get(0).add(0);
        
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'E') x++;
            else if(ch == 'W') x--;
            
            if(map.containsKey(x) && map.get(x)!=null && map.get(x).contains(y)) return true;
            if(map.containsKey(x)) map.get(x).add(y);
            else{
                map.put(x, new HashSet<>());
                map.get(x).add(y);
            }
        }
        
        return false;
    }
}
