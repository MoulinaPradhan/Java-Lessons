import java.io.*;
import java.util.*;

class Validator{
    public String  CheckComment(String s) throws SpamCommentException {
    String arr[] = s.split(" ");
    Map<String,Integer>map = new HashMap<>();
    map.put("abcde",0);
    map.put("lmno",0);
    map.put("pqrst",0);
    map.put("wxyz",0);

     if(s.contains("abcde" ) || s.contains("lmno") || s.contains("pqrst") || s.contains("wxyz"))
     throw new SpamCommentException("spam comment");
    
     for(String str: arr){
         if(map.containsKey(str)){
            map.getOrDefault(str,map.get(str)+1);
         }
     }

     if(map.get("abcde") > 1 || map.get("lmno") > 1 || map.get("pqrst") > 1 || map.get("wxyz") > 1)
     throw new SpamCommentException("account ban due to spam comment");

     return "comment is not spam";
    }
//  }
//   String commentTheString (String s){

//   } 

}
class SpamCommentException extends Exception
{
    SpamCommentException(String s){
        System.out.println(s);
    }
}


public class Sources {
    public static void main(String[] args) throws Exception{
        Validator obj = new Validator();
        System.out.println(obj.CheckComment("hi I'm writing"));
        
    }
}
