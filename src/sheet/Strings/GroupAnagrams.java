//https://leetcode.com/problems/group-s/
public class Groups {
    public static void main(String[] args) {
        
    }
    public List<List<String>> groups(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(String s: strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
                 map.get(key).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}
