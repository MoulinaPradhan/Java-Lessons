package src.Strings;

// Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

// The input string does not contain leading or trailing spaces and the words are always separated by a single space.

// For example,
// Given s = "the sky is blue",
// return "blue is sky the".

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         String s =sc.nextLine();
        String temp="";

        for(int i=s.length()-1;i>=0;i--)
{
  temp=temp+s.charAt(i);
}
System.out.println(temp);
    }
}
