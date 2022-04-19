package StringQuestions;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(len("ssbabah"));
    }
    public static int len(String s){
        if(s.isEmpty()) return 0;
        return 1+len(s.substring(1));
    }
}
