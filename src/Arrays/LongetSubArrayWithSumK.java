import java.util.*;

public class LongetSubArrayWithSumK {
    public static void main(String[] args) {
    int Arr[] = {10, 5, 2, 7, 1, 9};
    int K =15;
    int N=6;
    System.out.println(lenOfLongSubarr(Arr, N, K));    
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int pre[]=new int[A.length];
            pre[0]=A[0];
            Map<Integer,Integer> map=new HashMap<>();
            map.put(A[0],0);
            for(int i=1;i<A.length;i++) {
               pre[i]=pre[i-1]+A[i];
               map.put(pre[i],i);
            }
           // System.out.println(map);
            int mx=0;int i;
            for(i=0;i<pre.length-1;i++) {
                if(pre[i]==K)
                    mx=Math.max(mx, i+1);
                if(map.containsKey(pre[i]+K))
                    mx=Math.max(mx,map.get(pre[i]+K)-i);
            }
             if(pre[i]==K)
                 mx=Math.max(mx, i+1);
             
            // System.out.println(mx);
            return mx;
       }
       
       
   }
   

