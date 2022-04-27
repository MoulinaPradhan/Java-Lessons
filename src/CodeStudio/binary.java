public class binary {
  public static void main(String[] args) {
      System.out.println(longBinSubs("00010010010"));
  }
    static int longBinSubs(String s) {
        int max =0,c=1;
         for(int i=1;i<s.length();i++){
             if(s.charAt(i) != s.charAt(i-1)){
                 c++;
                 max = Math.max(max,c);
             }else{
                 c=1;
             }
         }
         if(max <2) return -1;
         else return max;
}
}