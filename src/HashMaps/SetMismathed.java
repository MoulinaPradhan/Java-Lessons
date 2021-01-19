package src.HashMaps;
import java.util.*;

public class SetMismathed {
public static void main(String[] args) {
    int nums[]={1,2,2,4};
    int arr[]=new int [nums.length];
    int a=0,b=0;
    HashSet<Integer> h = new HashSet<>();
    for(int i=0;i<nums.length;i++){
     
        if(h.contains(nums[i])){
         a=nums[i];
            // h.add(i+1);
        }
        h.add(nums[i]);
        
    }
    for (int i = 0; i < nums.length; i++) {
        if (!h.contains(i+1))
            b = i + 1;
    }
System.out.println(h);
int d[] = new int[] {a,b};
for(int e: d) System.out.println(e);

}
}
