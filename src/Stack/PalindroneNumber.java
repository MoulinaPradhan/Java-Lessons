package src.Stack;
import java.util.*;


public class PalindroneNumber {

    public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();
    int x= 123;
    if(x>=0)
    {
        int rev=0,num=x;
        while(num!=0)
        {
            rev=(rev*10)+(num%10);
            num=num/10;
        }
          if(rev==x)
          {
             System.out.println(true);
          }
    }  
    System.out.println(false);  
  
}

}
