
import java.util.*;
import java.lang.*;
import java.io.*;
public class infyS {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int  m=  Integer.parseInt(sc.readLine());
     
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(new ArrayList<>());
        }
     
        for(int i=0;i<m;i++){
            String inp[] = sc.readLine().split(",");
            for(int j=0;j<inp.length;j++){
                list.get(m).add(inp[j]);
            }
          
    }
  

// write code here

	 
    
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}






