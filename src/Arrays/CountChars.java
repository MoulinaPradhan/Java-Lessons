package src.Arrays;

public class CountChars {
    public static void main(String[] args) {
        String s = "aab";
        int [] hash = new int[26];
        for(char c : s.toCharArray()){
            hash[c-'a']++;
        }
        for(int i=0;i< hash.length;i++){
            System.out.println(hash[i]);
        }
    }
}
