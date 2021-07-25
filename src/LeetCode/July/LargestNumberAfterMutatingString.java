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
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<change.length;i++){
   int ch = change[i];
 
        map.put(ch,i);
    }
    // System.out.println(map);
    // char arr[] = num.toCharArray();
    // for(int i=0;i<arr.length;i++){
    //     int id= Character.getNumericValue(arr[i]);
    //     int ch=  map.get(id);
    //     if(id < ch){
    //         arr[i] = (char)ch;
    //         System.out.println(arr[i]);
    //     }else{
    //         System.out.println(" break");
    //         break;
    //     }
       
      
    // }

//  String ans = String.valueOf(arr);
//  System.out.println(ans);

int arr[] = new int[num.length()];

for(int i=0;i<num.length();i++){
    int id= Character.getNumericValue(num.charAt(i));
    arr[i] =id;
}

for(int i=0;i<num.length();i++){

    if(arr[i] <map.get(arr[i])){
        arr[i] = map.get(arr[i]);
    }else break;

    // System.out.println(id + "  "+map.get(id));
    

}
String res="";
// res
for(int e : arr){
    res+=String.valueOf(e);
}


return res;
  }
}
