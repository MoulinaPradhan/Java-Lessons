import java.io.*;

public class DEletionsOfTwoAdjacent {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            String s =sc.readLine();
            char c = sc.readLine().charAt(0);
            int a =0;
            for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
               int left =i-0; int right = s.length()-i+1;
               if(left %2 == 0 && right%2 ==0){
                   a=1;
                   break;
               }
               
            }
        }
            if(a==0)System.out.println("NO");
            else System.out.println("YES");
           
       

    
    }      
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
 

