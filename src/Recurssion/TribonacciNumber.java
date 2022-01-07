

import java.util.*;

public class TribonacciNumber {
    public static int tribonacci(int n) {
    if(n <= 1)return n;
       
    int triNum[] = new int[3];
    triNum[0]=0;
    triNum[1]=1;
    triNum[2]=1;

    for(int i=3;i<=n;i++){
        int newTri=triNum[0]+triNum[1]+triNum[2];

    //the shifting of arrays

    triNum[0]=triNum[1];
    triNum[1]=triNum[2];
    triNum[2]=newTri;

    }

    


    return triNum[2];

    }





public static void main(String[] args) {
    int n= 25;
    System.out.println(tribonacci(n));
}


}
