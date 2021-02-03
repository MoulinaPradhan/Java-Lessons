package src.ArrayList;
import java.util.*;

public class AverageSalery {
    public static void main(String[] args) {
        int salary[] = {4000,3000,1000,2000}; 

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<salary.length;i++){
            al.add(salary[i]);
        }
        int min =Collections.min(al);
        int max = Collections.max(al);

double sum=0;
      for(int i=0; i<salary.length;i++){
          if(salary[i] == min || salary[i] == max){
              sum=sum;
          }else{
            sum += salary[i];
         
            //  System.out.println(sum);
            
          }
      }


      System.out.println(sum/(salary.length-2));
    }
}
