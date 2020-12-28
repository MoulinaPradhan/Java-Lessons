package src.Strings;
import java.util.*;

public class CharacterConversion {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String st=sc.nextLine();
      for(int i=0;i<st.length();i++){
          char ch=st.charAt(i);
          if(Character.isUpperCase(ch)){
            st.toLowerCase();
            continue;
          }
      System.out.print(ch);
      }  
    }
}
