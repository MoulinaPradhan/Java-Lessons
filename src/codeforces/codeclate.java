import java.util.*;


public class codeclate {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String V = sc.next();
        int N = sc.nextInt();
      
        while(N -->0){
            String B = sc.next();
            boolean res = isSubsequence(B, V);
            if(res){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }
        }
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int j=0;
        for(int i=0;i<m;i++){
            if(j<n && s.charAt(j)== t.charAt(i)){
                j++;
            }
        }
        if(j==n) return true;
        else return false;
    }
}

