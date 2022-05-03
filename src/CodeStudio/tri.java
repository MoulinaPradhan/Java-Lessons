import java.util.ArrayList;

import java.util.*;
public class tri {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int d1 = sc.nextInt();
       int d2 = sc.nextInt();

    find(d1);
    find(d2);
    System.out.println(count);
    // System.out.println(list.size());

   }
   public static int count =0;
   public static void find(int d){
       for(int i =0;i<=9;i++){
           int x = d+i;
           if(x<=9){
            // String f = String.valueOf(x)+String.valueOf(i);
            count +=2;
            // permutaion("", f);
           }
          
       }
   }
   public static int fact (){
       return 2;
   }

   public static void permutaion(String ans,String og){
    if(og.isEmpty()) {
        // if(!list.contains(ans))
        list.add(ans);
        return;
    }
    char ch = og.charAt(0);
    for(int i=0;i<=ans.length();i++){
        String f = ans.substring(0, i);
        String s = ans.substring(i,ans.length());
        permutaion(f+ch+s, og.substring(1));
    }
}
}
