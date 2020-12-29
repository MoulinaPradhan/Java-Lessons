package src.Stack;

import java.util.*;

public class MakeGreater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
     Stack<Character> st= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
    
            if(Character.isUpperCase(ch)) {
                // str.toLowerCase();
                // st.pop();
               char ch1=Character.toLowerCase(ch);
                System.out.println( ch1); 
                st.push(ch1);
                continue;
              }    
                st.push(ch);
        }

    System.out.println(st);    
  
   char[] c=new char[st.size()];
   for(int i=c.length-1;i>=0;i--){
       c[i]=st.pop();
   } String m=new String(c);
   System.out.println(m);
  
    }
}
