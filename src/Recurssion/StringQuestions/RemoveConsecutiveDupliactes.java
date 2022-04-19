// https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/

package StringQuestions;

public class RemoveConsecutiveDupliactes {
    public static void main(String[] args) {
        System.out.println(remove("", "aaaaabbbbbb"));
        System.out.println(remove("", "aabccba"));
        System.out.println(remove("","geeksforgeeks"));
    }

    public static String remove(String ans, String og){
        if(og.isEmpty()) return ans;
        if(ans.length() >0 && ans.charAt(ans.length()-1) == og.charAt(0))
        return remove(ans, og.substring(1));
        else return remove(ans+og.charAt(0), og.substring(1));
    }


}
