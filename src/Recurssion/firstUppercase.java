public class firstUppercase {
    public static void main(String[] args) {
        System.out.println(getChar("geeksforgeeKs", 0));
    }
    public static char getChar(String s, int i){
        if(Character.isUpperCase(s.charAt(i))) return s.charAt(i);
        return getChar(s, i+1);
    }
}
