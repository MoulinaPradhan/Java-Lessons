package StringQuestions;

public class RemoveA {
    public static void main(String[] args) {
     System.out.println(sub("","bananan",0));   
     System.out.println(skip("", "bamaboo"));
    }
    public static String sub(String ans,String s,int n){
      if(n == s.length()) return ans;
      if(s.charAt(n)!='a')return sub(ans+s.charAt(n), s, n+1);
      return sub(ans, s, n+1);
    }
    // another method
    public static String skip(String ans, String og){
        if(og.isEmpty()) return ans;
        char ch = og.charAt(0);
        if(ch == 'a')
        return skip(ans, og.substring(1));
       return skip( ans+ch, og.substring(1));

    }
}
