package src.Strings;

import java.util.*;

public class InterleavedString {
    public static boolean isInterLeave(String a,String b,String c)
	{
        String u= a+b;
        String z= u.substring(0);
    
       return u.equals(c);     //Your code here
    }
    
public static void main(String[] args) {
    String a="yx";
    String b="x";
    String c="xxy";
  
    System.out.println(isInterLeave(a, b, c));

}

}
