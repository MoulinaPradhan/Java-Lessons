package src.Strings;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
	for(int i=0; i<t; i++){
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(Math.max(s1.length(),s2.length()));
		System.out.println(s1+s2);
	}
    }
}
