import java.util.*;

public class GreatestEvenNum {
    public static void main(String[] args) {
     String s="Hello#81@21349";
     s=s.replaceAll("[^\\d]", "");//remove aplbhabet
    //  s=s.replaceAll("\\w","");//remove special character
     System.out.println(s);

     Set<Integer>set = new TreeSet<>();//remove duplicate number
     for(int i=0;i<s.length();i++){
         set.add(Integer.parseInt(String.valueOf(s.charAt(i))));
     }
     List<Integer>list = new ArrayList<>(set);
     Collections.sort(list,Collections.reverseOrder());

     boolean noEven = true;
     int len = list.size();
     for(int i=len-1;i>0;i--){
         if(list.get(i)%2==0){
             list.add(list.get(i)); // add this number at the end
             list.remove(i);//remove te no. from the current pos
             noEven=false;
             break;
         }
     }
     if(noEven)System.out.println("-1");
     else{
         for(int ele:list)
         System.out.print(ele);
     }
    }
}
