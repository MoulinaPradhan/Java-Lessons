public class VowelString {
  public static void main(String[] args) {
      String arr[] ={"Ate","Ace","Girl"};
      System.out.println(fn(arr.length,arr));     
  }  

  public static String fn(int n, String arr[]){
      String ans ="";
      String vowel ="aeiouAEIOU";
      for(String a: arr){
          if(vowel.contains(""+a.charAt(0))&& vowel.contains(""+a.charAt(a.length()-1))){
              ans+=a;
              ans.toLowerCase();
          }
      }
      if(ans.equals("")) return "no matches found";
      return ans.toLowerCase();
  }
}
