import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class PrintAllDuplicates {
    public static void main(String[] args) {
        String s ="geeksforgeeks";
       
    }
    public static int[] countDuplicates(String s){
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a']++; //returning the frequency
        }
//         for(int i=0;i<26;i++){
// System.out.print((char)(i+'a')); // prints the arr[i];
//         }
        return arr;
    }
}
