package src.Arrays;
import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int nums1[] ={1,2,2,1};
        int nums2[] = {2,2};

        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
h.add(nums1[1]);
        }
for(int i=0;i<nums2.length;i++){
    if(h.contains(nums2[1])){
        result.add(nums2[1]);
    }
}
int res[] = new int [result.size()];
int j=0;
for(Integer i :result){
res[j++] = i.intValue();
}
System.out.println(res);

    }
}
