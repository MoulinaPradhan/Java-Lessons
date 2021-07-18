public class CustomSort {
   public static void main(String[] args) {
     String str= "abcd";
     String order="cba";
     int arr[] = new int[26];
     String ans =order;
     for(int i=0;i<str.length();i++){
     arr[str.charAt(i)-'a']++;
     }
     for(int i=0;i<order.length();i++){
         arr[order.charAt(i)-'a']--;
     }
 
     for(int i=0;i<arr.length;i++){
        char ch=(char)('a'+i);
         if(arr[i]>0){
             ans+=String.valueOf(ch).repeat(arr[i]);
         }

     }

System.out.println(ans + "  ans");
    }
}
 //
     