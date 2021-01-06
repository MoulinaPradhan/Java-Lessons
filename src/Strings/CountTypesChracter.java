package src.Strings;
import java.util.*;

public class CountTypesChracter {
    public static void main(String[] args) {
        String s = "#GeeKs01fOr@gEEks07";
        System.out.println(count(s));
    }
   public static int[] count (String s)
    {
      
int upper=0,lower=0,special=0,num=0;
for(int i=0;i<s.length();i++){
    if(Character.isUpperCase(s.charAt(i))){
      upper=upper+1;
    }
    else if(Character.isLowerCase(s.charAt(i))){
        lower=lower+1;
    }
    else if(Character.isDigit(s.charAt(i))){
        num=num+1;
    }
    else{
        special= special+1;
    }
}
int arr[]= {upper,lower,num,special};

for(int e:arr) System.out.println(e);

        return arr;
    }
}
