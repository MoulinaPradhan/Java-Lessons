public class ReverseWithoutSpecial {
    public static void main(String[] args) {
    String s ="a#b@c";
    System.out.println(rer(s));
    }
    public static String rer(String str){
        char s [] = str.toCharArray();
        int r = s.length-1,l=0;
        while(l<r){
        
if(!Character.isLetter(s[l]))
l++;
else if(!Character.isAlphabetic(s[r])) r--;
else{
    char temp=s[l];
   s[l]= s[r];
   s[r] = temp;
   l++;
   r--;
}

        }
        return String.valueOf(s);
    }


}
