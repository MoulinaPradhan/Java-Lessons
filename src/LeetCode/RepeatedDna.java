
import java.util.*;

public class RepeatedDna {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        
        Set<String>set = new HashSet<>();
        Set<String> ans = new HashSet<>();

        for(int i=0;i<s.length()-10;i++){
            String sub = s.substring(i, i+10);
                if(set.contains(sub)){
                    ans.add(sub);
                }else{
                    set.add(sub);
                }
            }

System.out.println(new ArrayList<>(ans));



        }





    }

