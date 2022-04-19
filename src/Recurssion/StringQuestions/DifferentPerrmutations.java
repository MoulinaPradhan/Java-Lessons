package StringQuestions;

public class DifferentPerrmutations {
    public static void main(String[] args) {
        permutaion("", "abc"); // no. permutaions 3!
    }
    public static void permutaion(String ans,String og){
        if(og.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = og.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i,ans.length());
            permutaion(f+ch+s, og.substring(1));
        }
    }
}
