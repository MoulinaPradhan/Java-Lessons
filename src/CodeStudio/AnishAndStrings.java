public class AnishAndStrings {
    public static void main(String[] args) {
        String s = "bbbcbabccabbabbaabaaaacbacacabc";
        System.out.println(count(s.length(), s));
    }
    public static String count(int n, String s) {
        String ans ="";
        int mid = s.length()/2;
        String f= s.substring(0, mid);
        String e = s.substring(mid);
        // System.out.println(f+" "+e);

            // int i=0, j= s.length()-1;
            // while(i<=j){
            //     if(s.charAt(i) == s.charAt(j)){
            //         ans+=s.charAt(i);
            //     }
            //     else if(s.charAt(i) != s.charAt(j))break;
            //     i++;
            //     j--;
            // }
        for(char c:f.toCharArray()){
         String r = ans+c;
         if(e.contains(r)){
             ans+=c;
         }
         else break;
        }
        return ans;
    }

}