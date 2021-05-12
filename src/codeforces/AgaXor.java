

import java.util.*;


public class AgaXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
           if(numxor(arr) == false)System.out.println("NO");
           else System.out.println("YES");
        }
    }
        public static boolean numxor(int [] arr){
            if(arr.length == 1) return true;
            List<Integer>list = new ArrayList<>();
            if(arr.length %2 ==0){
                for(int i =0;i<arr.length;i+=2){
                    int j=i+1;
                    int m = arr[i] ^ arr[j];
                    list.add(m);
                }
            }else{
                for(int i =0;i<arr.length;i+=2){
                    int j=i+1;
                    int m = arr[i] ^ arr[j];
                    list.add(m);
                }
            }
           
            
          if(arr.length %2 !=0) return list.get(0) == arr[arr.length-1];
    return  list.get(0) == list.get(1);
        }
    
}
