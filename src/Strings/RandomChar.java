package src.Strings;

import java.util.*;

public class RandomChar {
  public static void main(String[] args) {
    String s="j?qg??b";

System.out.println(modifyString(s));

  }

  public static String modifyString(String s) {
   
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!='?'){
        sb.append(s.charAt(i));
      }else{
        sb.append(newChar(i>0?sb.charAt(i-1):'\0',i<s.length()-1?s.charAt(i+1):'\0'));
      }
    }

    return sb.toString();
  }
  public static char newChar(char prev,char next){
    char c='a';
    while(c<='z'){
      if(c==prev || c==next)
          c++;
      else
          break;
  }
    return c;
  }
}
