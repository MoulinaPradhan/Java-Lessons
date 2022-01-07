public class Palindrome {
    public static String s="madam";
    public static void main(String[] args) {
        System.out.println(isPali(0));
    }
    public static boolean isPali(int i){
        int n = s.length();
        if(i>=n/2)return true;
         if(s.charAt(i) != s.charAt(n-i-1))return false; // tc -O(n/2)
        return isPali(i+1);  //sc:- O(n/2)
     
    }
}
