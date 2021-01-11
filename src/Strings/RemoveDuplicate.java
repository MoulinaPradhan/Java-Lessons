package src.Strings;

public class RemoveDuplicate {
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int idx;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            idx = s.indexOf(c, i + 1);
            if (idx == -1) {
                sb.append(c);
            }
        }   
        return  sb.toString();
    }
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
