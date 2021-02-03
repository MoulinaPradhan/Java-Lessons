package src.Arrays;
import java.util.*;

public class CreateTargetinOrder {
public static void main(String[] args) {
    int nums[]={ 0,1,2,5,7};
    int index[]={0,1,2,2,1};

    int result[]=new int[nums.length];
    ArrayList<Integer> al = new ArrayList<>();


for(int i=0;i<nums.length;i++){
al.add(index[i],nums[i]);
}

for(int i =0;i<nums.length;i++){
    result[i]=al.get(i);
}


for(int e:result)System.out.println(e);

}    
}
