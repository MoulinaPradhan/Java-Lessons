
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        int n=15;
String s="";
for(int i=1;i<=n;i++){
    if(i%3==0 && i%5==0){
        s="FizzBuzz";
    }
    else if(i%3==0){
    s="Fizz";
    }
    else if(i%5==0){
        s="Buzz";
    }
   else{
        s= String.valueOf(i);
    }
   
    System.out.println(s);
}

    }
}
