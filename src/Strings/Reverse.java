package src.Strings;
import java.util.*;
public class Reverse {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();

	 for(int i=0;i<t;i++){
	 String A = sc.next();
	 String B= sc.next();
     String C= A+B;
    //  System.out.println(C);
     int length=C.length();
     for(int j=length-1;j>=0;j--){
     String rev="";
        rev=rev+C.charAt(j);
  System.out.print(rev);
     }  
     System.out.println("");
     }
     
     
    }
}
