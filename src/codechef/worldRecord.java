
import java.text.DecimalFormat;
import java.util.*;

import java.util.*;


public class worldRecord {
  public static void main(String[] args) {
      
    double record =9.58;
 
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        float k1 = sc.nextFloat();
        float k2 = sc.nextFloat();
        float k3 = sc.nextFloat();
        float v = sc.nextFloat();
        float mt =100/(k1*k2*k3*v);
        double time = Math.round(mt * 100.0)/100.0;
        if((float)time < (float)record){
          System.out.println("YES");
        }else{
          System.out.println("No");
        }

    }
  }  
}
