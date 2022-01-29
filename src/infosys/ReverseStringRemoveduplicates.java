public class ReverseStringRemoveduplicates {
    public static void main(String[] args) {
        String s = "infosys";
        System.out.println(RemoveDuplicate(s));

    }
    public static String RemoveDuplicate(String s){
        String mnew = "";
       for(int i=0;i<s.length();i++){
        if(!mnew.contains(""+s.charAt(i))){
            mnew+=s.charAt(i);
        }
     }
String ans ="";
for(int i=mnew.length()-1;i>=0;i--){
    ans+=mnew.charAt(i);
}
    
     
return  ans;
    }
}
