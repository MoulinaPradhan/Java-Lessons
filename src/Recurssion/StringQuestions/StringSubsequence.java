package StringQuestions;

public class StringSubsequence {
    public static void main(String[] args) {
        st("","abc");
    }
    static void st(String ans, String og){
        if(og.isEmpty()) {
            System.out.println(ans);
            return;
        }
        st(ans+og.charAt(0), og.substring(1));
        st(ans, og.substring(1));
    }
}
