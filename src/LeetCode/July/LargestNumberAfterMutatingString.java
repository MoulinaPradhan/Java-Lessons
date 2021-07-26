package July;
import java.util.*;
import java.io.*;

public class LargestNumberAfterMutatingString {
  public static void main(String[] args) throws Exception {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    String s = sc.readLine();
    int arr[] = new int [10];
    String input[] = sc.readLine().split(",");
    for(int i = 0; i < input.length; i++) {
    arr[i] = Integer.parseInt(input[i]);
    }
    
System.out.println(maximumNumber(s, arr)); 
  }  
  public static String maximumNumber(String num, int[] change) {
  char chars[] = num.toCharArray();
  boolean changed = false;
  for(int i = 0; i < chars.length; i++) {
    int old = chars[i] - '0';
    int news=change[old];
    if(news > old) {
    chars[i] = (char)(news+'0');
  changed= true;
    } if ( news < old && changed) {     
      break; 
}

  }
  return new String(chars);
}
}