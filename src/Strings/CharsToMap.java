public class ChrasToMap {
    public static void main(String[] args) {
      String str= "aabcdz";
      int arr[] = new int[26];
      for(int i=0;i<str.length();i++){
  arr[str.charAt(i)-'a']++;
  }
  
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
         }
 
         System.out.println(" ");
         //print char
         for(int i=0;i<26;i++)
 {
     char ch=(char)('a'+i);
     System.out.println(ch+":"+arr[i]);
 }
 System.out.println("-------------------------------------------");
 // to print only the occuring chars
 for(int i=0;i<26;i++)
 {
     char ch=(char)('a'+i);
     if(arr[i]>0)
     System.out.println(ch+":"+arr[i]);
 }
 
 //example
 String s = "uip";
 char w='d';
 System.out.println(s+w);
 }
 }