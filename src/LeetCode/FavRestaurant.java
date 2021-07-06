
import java.util.*;
/**
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

 

Example 1:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
Example 3:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Burger King","Tapioca Express","Shogun"]
Output: ["KFC","Burger King","Tapioca Express","Shogun"]
Example 4:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KNN","KFC","Burger King","Tapioca Express","Shogun"]
Output: ["KFC","Burger King","Tapioca Express","Shogun"]
Example 5:

Input: list1 = ["KFC"], list2 = ["KFC"]
Output: ["KFC"]

 */
public class FavRestaurant {
    public static void main(String[] args) {
        String list1[]={ "Shogun","Tapioca Express","Burger King","KFC" };
        String list2[] = { "KFC","Shogun","Burger King" };

        int min=list1.length +list2.length;
HashMap<String, Integer> map = new HashMap<>();
List<String> l = new ArrayList<>();

for(int i=0; i <list1.length; i++){
    map.put(list1[i],i);
}
for(int j=0; j<list2.length;j++){
    String key = list2[j];
    if(map.containsKey(key)){
        if(map.get(key) + j == min){
l.add(key);
        }
        if(map.get(key) + j < min){
            min = map.get(key) + j;
            l.clear();
            l.add(key);
        }
    }
}
String arr [] = l.toArray(new String[l.size()]);

//print
for(String e:arr)System.out.println(e);
    }
}
