public class PalindromicSubstring{
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
    public static int countSubstrings(String s) {
        int dp[][] = new int [s.length()][s.length()];
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)== s.charAt(j) && j==0 && i==0){
                    dp[i][j] =1;
                }
              else if(s.charAt(i)== s.charAt(j) && j==0){
                  dp[i][j] = dp[i-1][j]+1;
              }
                else if(s.charAt(i)== s.charAt(j) ){
                    dp[i][j] = dp[i][j-1]+1;
                }
        else if(s.charAt(i)!= s.charAt(j) && j==0) 
                    dp[i][j] = dp[i-1][j] ;
                else{
                    dp[i][j] =dp[i][j-1];
                }
            }
        }

       for(int i=0;i<s.length();i++){
           for(int j=0;j<s.length();j++){
               System.out.print(dp[i][j] +" ");
           }
           System.out.println();
       }
       
        return dp[s.length()-1][s.length()-1]+1;
    }
}