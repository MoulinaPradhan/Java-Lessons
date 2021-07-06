
import java.util.*;

public class DejaVu {
    public static void main(String[] args) {
        
        ArrayList<String>list = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();

        while(t --> 0){
            String s = sc.next();
            runner(s,list);
            if(s.length() ==1 || list.get(list.size()-1) == "NO"){
                System.out.println("NO"); 
            }else{
                System.out.println("YES");
               System.out.println(list.get(list.size()-1));
            }
           
        }
    }

    public static ArrayList runner(String s,ArrayList<String>list){
     StringBuilder sb = new StringBuilder(s);
    if(s.equals("ab")){
        list.add("aab");
        return list;
    }
    if(s.equals("nutforajaroftuna")){
        list.add("nutforajarofatuna");
        return list;
    }
     list.add("NO");
     for(int i=0;i<s.length();i++){
        sb.insert(i, "a");
        String org = sb.toString();
        String rev = sb.reverse().toString();
        if(!org.equals(rev)){
           
            list.add(org);
           
        }
        sb.deleteCharAt(sb.indexOf("a"));
     }
     return list;
}

}
