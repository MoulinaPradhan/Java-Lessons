package src.Strings;

import java.util.*;

public class ArraySpaces {
    public static void main(String[] args) {
        String text = "  this   is  a sentence ";
    
        sb.append(text);
        int count=0;
        for(int i=0;i<text.length();i++){
           if(text.charAt(i) == ' '){
    count ++;
}else{
    count =count;
}
        }


System.out.println(count);


    }
}
