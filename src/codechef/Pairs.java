package src.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;



public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    
	    String ans ="no";
	    if(A == B || A ==C || B==C){
	        ans="yes";
	        
	    }
	   System.out.println(ans);
    }
}
