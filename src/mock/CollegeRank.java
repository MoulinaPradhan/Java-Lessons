
import java.util.*;
import java.lang.*;
import java.io.*;
public class CollegeRank {
    public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

         String[] input = new String[2];
            input = sc.readLine().split(" ");
            
          int C = Integer.parseInt(input[0]);
          int N =  Integer.parseInt(input[1]);

          String [] collegeSeats = new String[C];
          collegeSeats = sc.readLine().split(" ");

          Map<String,Integer> seats = new TreeMap<>();
for(int i=0;i<C;i++){
    seats.put("C-"+String.valueOf(i+1),Integer.parseInt(collegeSeats[i]));
}
    

          Map<Double,String> map = new TreeMap<>(Collections.reverseOrder());

          while(N-->0){
              String information =sc.readLine();
              String info[] = information.split(",");
              double score =Double.parseDouble(info[1]);
              String s = info[2]+":"+info[3]+":"+info[4];
              map.put(score, s);

          }

         String listOfColege= sc.readLine();
         String list[] = listOfColege.split(",");
         Map<String,Double> ans = new HashMap<>();

         for(Map.Entry<Double,String>e: map.entrySet()){
           String str= e.getValue();
           String arr[] = str.split(":");
           if(seats.get(arr[0])!=0){
              seats.put(arr[0],seats.get(arr[0])-1);
              ans.put(arr[0], e.getKey());
           }
      else if(seats.get(arr[1]) !=0){
            seats.put(arr[1],seats.get(arr[1])-1); 
            ans.put(arr[1], e.getKey());
        }
     else if (seats.get(arr[0])==0 && seats.get(arr[1]) ==0 && seats.get(arr[2]) !=0){
            seats.put(arr[2],seats.get(arr[2])-1); 
            ans.put(arr[2], e.getKey());  
        }else{
            List<Integer> sorted =new ArrayList<>( seats.values());
            Collections.sort(sorted);
            int idx = sorted.size()-1;
          
        }
        
     
         }



for(String w:list){
    if(ans.get(w) == null) System.out.println(w+" "+"n/a");
    else
    System.out.println(w+" "+ans.get(w));
}

        
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
}


