
import java.util.*;

/**
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

 

Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]
 

 */

public class FindCommonChars {
    public static void main(String[] args) {
        String A[] =  {"bella","label","roller"};
        Stack<String> st = new Stack<>();
      

    }
    public List<String> commonChars(String[] A) {
        List<HashMap<Character,Integer>> map = new ArrayList<>();
              List<String> list=new ArrayList<>();
              for(int i=0;i<A.length; i++) {
                  String s=A[i];
                  map.add(i,new HashMap<>());
                  for(int j=0;j<s.length(); j++) {
                      HashMap<Character,Integer> tmap=map.get(i);
                      char key=s.charAt(j);
                      tmap.put(key,tmap.containsKey(key)?tmap.get(key)+1:1);
                  }
              }
  
              for(int i=0;i<A[0].length(); i++){
                  int count=0;
                  char key=A[0].charAt(i);
                  for(int j=0;j<map.size();j++) {
                      HashMap<Character,Integer> childMap =(HashMap<Character,Integer>)map.get(j);
                      if(childMap.containsKey(key) && childMap.get(key)!=0){
                          count++;
                          childMap.put(key,childMap.get(key)-1);
                      }
                  }
                  if(count==A.length)
                      list.add(Character.toString(key));
              }
              return list;   
      }
}
