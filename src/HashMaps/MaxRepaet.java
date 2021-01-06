package src.HashMaps;

import java.util.*;
import java.util.Map.*;

public class MaxRepaet {
    public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList<>();
Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
int Arr[]={2, 2, 1, 0, 0, 1};
 Arrays.sort(Arr);
int count =1;
for(int i=1;i<Arr.length;i++){
    if(Arr[i-1]==Arr[i]){
        count=count+1;
        hm.put(Arr[i],count);
    }
    else{
        hm.put(Arr[i],1);
    }

}
// for(int e: al) System.out.println(e);
// System.out.println(hm);

int max_count =0;
int mode =-1;

for(Entry<Integer,Integer> val: hm.entrySet()){
if(max_count<=val.getValue()) {
    mode=val.getKey();
    max_count=val.getValue();
}
}

Entry<Integer, Integer> min = null;
for (Entry<Integer, Integer> entry : hm.entrySet()) {
    if (min == null || min.getValue() > entry.getValue()) {
        min = entry;
    }
}

// System.out.println("Min"+min.getKey());
// System.out.println("Maximum repeated element in the array = "+mode);
// System.out.println("Number of times it occured= "+max_count);

if(hm.containsValue(max_count)){
    System.out.println(min.getKey());
}
else System.out.println(mode);
    }

}


