package StringQuestions;
import java.util.*;
public class WordBreak {
    public static void main(String[] args) {
  String [] By = { "i", "like", "sam",
"sung", "samsung", "mobile",
"ice","cream", "icecream",
"man", "go", "mango" };
String A = "ilike";

ArrayList <String> B = new ArrayList<>();
for(int i=0;i<By.length;i++){
    B.add(By[i]);
}

System.out.println(wordBreak(A, B));
System.out.println(dpn(A, B));


    }
    public static int wordBreak(String A, ArrayList<String> B )
    {
        if(B.contains(A)) return 1;
      if(rec(A, B,0)) return 1;
      return 0;
    }
 
        public static boolean rec(String A, ArrayList<String> B, int index) {
            if (index == A.length())
                return false;
            
            String prefix = A.substring(0, index);
            String suffix = A.substring(index, A.length());
            if (B.contains(prefix) && B.contains(suffix))
                return true;
            else if (B.contains(prefix) && !B.contains(suffix))
                return rec(suffix, B, 1) || rec(A, B, index+1);
            else
                return rec(A, B, index+1);
        }

// dp approach if the last index value is greater than 0 it is true
// dp[s.length()-1] >0 return true;

public static int dpn (String s ,ArrayList<String> B){
    int dp[] = new int [s.length()];
    for(int i=0;i< s.length();i++){
        for(int j=0;j<=i;j++){
            String word = s.substring(j, i+1);
if(B.contains(word)) dp[i]++;
        }
    }

return dp[s.length()-1] >0 ? 1:0;

}


    }


