package src.codechef;
import java.text.DecimalFormat;
import java.util.*;

import java.util.*;


public class worldRecord {
  public static void main(String[] args) {
      
    double record =9.58;
    String ans = "yes";
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    DecimalFormat ds = new DecimalFormat();
    df.setMaximumFractionDigits(1);
    ds.setMaximumFractionDigits(2);
    int t = sc.nextInt();
    while(t-->0){
        double k1 = sc.nextDouble();
        df.format(k1);
      
        double k2 = sc.nextDouble();
        df.format(k2);
        double k3 = sc.nextDouble();
        df.format(k2);
        double v= sc.nextDouble();
       ds.format(v);
        
        double speed = k1*k2*k3*v;
        double mt =100/speed;
        double time = Math.round(mt * 100.0)/100.0;
        if(time >= record)ans ="no";
        System.out.println(speed + "timne" + time);
        System.out.println(ans);

    }
  }  
}
