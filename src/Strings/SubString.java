package src.Strings;

import java.util.*;

/**
 * SubString
 */
public class SubString {

    public static void main(String[] args) {
       String S= "cdbkdub";
       int L=0; int R=5;
       StringBuilder sb= new StringBuilder();
       for (int i=L;i<=R;i++){
           System.out.print(S.charAt(i));
           
       }
       System.out.println(" ");
      System.out.println( S.substring (L, R+1));
    }
}