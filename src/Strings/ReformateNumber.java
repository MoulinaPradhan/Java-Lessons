package src.Strings;

import java.util.*;

public class ReformateNumber {
  public static void main(String[] args) {
    String number = "1-23-45 6";
   System.out.println(reformatNumber(number));
  }
public static String reformatNumber(String number) {
   
    String ans="";
    ans=number.replace(" ", "");
     ans=ans.replace("-", "");
  
     if(ans.length()<=3){
    return ans;
     }
     else if(ans.length() == 4){
      return ans.substring(0, 2)+ "-" + ans.substring(2, 4);
     }
     else{
     ans=ans.substring(0, 3)+ "-" + reformatNumber(ans.substring(3, ans.length()));   
     }
       
      return ans;
    }
    
}

