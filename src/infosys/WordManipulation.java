import java.util.Arrays;
import java.util.TreeMap;

public class WordManipulation{
    public static void main(String[] args) {
   
        System.out.println((int)'A');
        System.out.println((int)'a');
    
        System.out.println(97-65);
        
        TreeMap<String,Integer>map = new TreeMap<String,Integer>();
String s ="HelLoWOrld";

for(int i=0;i<s.length();i++){
    if((int)s.charAt(i) >96){
        map.put(""+s.charAt(i),map.getOrDefault(""+s.charAt(i), (int)s.charAt(i)-32));
    }else{
        map.put(""+s.charAt(i), map.getOrDefault(""+s.charAt(i),(int)s.charAt(i) ));
    }
}

String arr[] = {"d", "e", "H", "lLl", "oO", "r", "W"};
Arrays.sort(arr);
for(String e:arr)System.out.println(e);
System.out.println(map);
    }
}