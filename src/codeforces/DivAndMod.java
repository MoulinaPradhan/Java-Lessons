import java.io.*;

public class DivAndMod {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    int  t =  Integer.parseInt(sc.readLine());
        while(t --> 0){
            String[] input = new String[3];
            input = sc.readLine().split(" ");
            int l= Integer.parseInt(input[0]);
            int r= Integer.parseInt(input[1]);
            int a= Integer.parseInt(input[2]);
            
            int max=0,ans =0;
            for(int i=l;i<=r;i++){
                ans = (i/a)+(i%a);
                max = Math.max(max,ans);
            }
            System.out.println(max);
    
    }      
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}
 


