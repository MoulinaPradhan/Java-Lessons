public class lengthOfString {
   public static void main(String[] args) {
       System.out.println(len("abcd"));
       System.out.println("abcd".substring(1));
   } 
   public static int len(String s){
       if(s.equals("")) return 0;
       return 1+len(s.substring(1));
   }
}
