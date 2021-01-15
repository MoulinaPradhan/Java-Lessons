package src.LeetCode;

public class LargestSubstring {
    public static void main(String[] args) {
        String s="cbzxy";
        char[] carr = s.toCharArray();
        int beg=0,end=0; 
                for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
               if (carr[i] == carr[j]) {
                beg=i+1;end=j;
                break;
               }
               else{
                   beg=0;end=0;
               }
            }
           
         }
         if(s.substring(beg,end).length()==0)System.out.println("po");
  System.out.println(s.substring(beg,end).length());
}
    
}
