package StringQuestions;

public class findKthBinaryString {
    public static void main(String[] args) {
        System.out.println(fn(4).charAt(11-1));

    }
  static String fn(int n){
      if(n ==1) return "0";

      return fn(n-1)+"1"+invert(fn(n-1));
  }
  static String invert(String s){
    String ans ="";
    for(int i=s.length()-1;i>=0;i--){
       if(s.charAt(i) =='0')ans+='1';
       else ans+='0';
    }
  return ans;
  }
  
}
