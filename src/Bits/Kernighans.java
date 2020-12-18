package src.Bits;

import java.util.*;
public class Kernighans {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int counter=0;
        int n= sc.nextInt();
       while(n!=0){
         int rbsm=n & -n;
            n-=rbsm;
            counter ++;
        }
    
        System.out.println(n);
    }
}
