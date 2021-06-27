
import java.util.*;

public class Candy {
public static void main(String[] args) {
    int candyTypes[] ={ 1,1,2,2,3,3 };
    HashSet<Integer> temp = new HashSet<>();
    for(int i : candyTypes){
        temp.add(i);
        if(temp.size() >= (candyTypes.length)/2) break;
    }
    System.out.println(temp.size());
}    
}
