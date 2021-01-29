package src.LeetCode;
import java.util.*;

public class DuplicateZeroes {
    public static void main(String[] args) {
     int arr[] ={1,0,2,3,0,4,5,0};
     List<Integer> al = new ArrayList<>();
     for(int i =0;i<arr.length;i++){
         if(arr[i]==0){
             al.add(arr[i]);
             al.add(0);
         }else{
             al.add(arr[i]);
         }
     } 
     for(int i=0;i<arr.length;i++)
     {
         arr[i] = al.get(i);            
     }      
    
    for(int e: arr)System.out.print(e);
    
    
    
    
    }









}
