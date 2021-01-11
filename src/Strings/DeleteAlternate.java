package src.Strings;

import java.util.*;

public class DeleteAlternate {
  public  static String delAlternate(String S) {

   StringBuilder sb= new StringBuilder();
//    sb.append(S.charAt(0));
   for(int i=0;i<S.length();i++){
    if(i%2==0){
        sb.append(S.charAt(i));
    }   
    }
return sb.toString();
}
public static void main(String[] args) {
    String S = "GeeksforGeeks";
    System.out.println(delAlternate(S));
}    
}
