import java.util.*;


public class Brownie {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  String m = sc.next();
  String arr [] = m.split("\\s");
  find(n, arr);
} 
public static int find(int n,String []arr){
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0;i<arr.length;i++){
    if(arr[i].contains("2")){
        map.put(2, map.getOrDefault(2, 0)+1);
    } 
    else if(arr[i].contains("3")){
        map.put(3, map.getOrDefault(3, 0)+1);
    } 
    else if(arr[i].contains("5")){
        map.put(5, map.getOrDefault(5, 0)+1);
    } 
   else if(arr[i].contains("7")){
        map.put(7, map.getOrDefault(7, 0)+1);
    } 
        
    }
    System.out.println(map);
    return 1;
    }


}  

