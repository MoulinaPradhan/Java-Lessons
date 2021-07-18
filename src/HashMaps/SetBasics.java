import java.util.*;

public class SetBasics{
    public static void main(String[] args){
int nums[]={4,3,2,7,8,2,3,1};
System.out.println(findDisappearedNumbers(nums));
}
public static List<Integer> findDisappearedNumbers(int[] nums) {
    // O(n)

    Set<Integer> set = new TreeSet<>();
    for(int e : nums) set.add(e);
    List<Integer> list = new ArrayList<>(set);
    
int min = list.get(0);
for(int i = 0; i < list.size(); i++){
if(list.get(i) == min){
    list.remove(i);
}else{
    list.add(min);
}
min++;
}   
    return list;
}
}