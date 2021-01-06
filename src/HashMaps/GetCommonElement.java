package src.HashMaps;

import java.util.*;

public class GetCommonElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);  
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]= sc.nextInt();
        }

        int n2=sc.nextInt();
        int [] a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]= sc.nextInt();
        }
        System.out.println("-------");
        for(int e: a1) System.out.print(e+' ');
        System.out.println("-------");
        for(int f:a2)System.out.print(f+' ');
    
        HashMap<Integer,Integer> fmap= new HashMap<>();
        for(int val:a1){
            if(fmap.containsKey(val)){
                int of= fmap.get(val);
                int nf = of + 1;
                fmap.put(val, nf);
            } else{
                fmap.put(val,1);
            }
        }
   
   for(int val:a2){
       if(fmap.containsKey(val)){
           System.out.println(val);
           fmap.remove(val);
       }
   }
   
    }
}
