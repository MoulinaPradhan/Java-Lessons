import java.util.*;


public class MikePhotographer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n= sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
           System.out.println(generate(arr,0,new ArrayList<>())); 
          
        }
        }
      
        public static boolean match(int a, int b) {
 
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);

            for(int i=0;i<s1.length();i++){
                char ch = s1.charAt(i);
                String s = String.valueOf(ch);
                if(s2.contains(s)) return true;
            }
           return false;
          }
  
          public static   int max=0;
          public static int generate(int nums[],int start,List<Integer> tempList){
      
            if(tempList.size()>1){
                for(int i=1;i<tempList.size();i++){
                    boolean common = match(tempList.get(0),tempList.get(1));
                    int diff=0;
                     if(!common){
                         diff+=tempList.get(0)+tempList.get(1);
                     }
                   max=  Math.max(max,diff);
                 
                    }
                 
                }
                
         for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                generate(nums,  i + 1,tempList);
                tempList.remove(tempList.size() - 1);
            }
            return max;
          }
    }
    

