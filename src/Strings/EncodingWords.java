package src.Strings;
import java.util.*;

public class EncodingWords {
public static void main(String[] args) {
  String [] words = {"time", "me", "bell"};
  System.out.println(minimumLengthEncoding(words)); 
}  
public static int minimumLengthEncoding(String[] words) {
StringBuilder sb = new StringBuilder();
Set<Character> set = new HashSet<>();

for(int i=0;i< words.length;i++){
   for(int j=0;j<words[i].length();j++){
    set.add(words[i].charAt(j));
}
}
for(int i=0;i<words.length;i++){
    if(set.contains(words[i].charAt(i))){
        sb.append(words[i]);
    }
}
  System.out.println(set);  
System.out.println(sb.toString());
return sb.toString().length();

}  
}
