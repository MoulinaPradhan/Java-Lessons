package StringQuestions;

public class RemoveString {
    public static void main(String[] args) {
        String s = "eatapplepie";
  
        System.out.println(st(s));
    }
    public static String st(String s){
        if(s.isEmpty()) return s;
        if(s.startsWith("apple"))
        return st(s.substring("apple".length()));
        return s.charAt(0)+st(s.substring(1));
    }
}
