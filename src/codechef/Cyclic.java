import java.util.*;


public class Cyclic{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();
       while(t -->0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           int d = sc.nextInt();

           
           if(a+c ==180){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
       }

     
   }
}