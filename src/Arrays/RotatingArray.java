
import java.util.*;

public class RotatingArray {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       ArrayList<Integer> al = new ArrayList<>();
       int k=2;
       int rotation=k;
       while(rotation < arr.length){
           al.add(arr[rotation]);
           rotation++;
       }
 rotation=0;
while(rotation<k){
    al.add(arr[rotation]);
    rotation++;
}

     
for(int e:al) System.out.println(e);
    }
}
