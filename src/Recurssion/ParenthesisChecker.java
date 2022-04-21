public class ParenthesisChecker {
    public static void main(String[] args) {
        System.out.println( fn("","{([])}"));
        System.out.println(fn("","([]"));
    }
    public static boolean fn(String ans,String og){
if(og.isEmpty() && ans.isEmpty()) return true;
if(ans.length()>1 && ((ans.charAt(ans.length()-1) == '(' && og.charAt(0) ==')') || (ans.charAt(ans.length()-1) == '{' && og.charAt(0) =='}' ) || (ans.charAt(ans.length()-1) == '[' && og.charAt(0) ==']')))
return fn(ans.substring(0, ans.length()-1),og.substring(1));
return fn(ans+og.charAt(0),og.substring(1));

    }
}
