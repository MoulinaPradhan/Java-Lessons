/* package codechef; // don't place package name! */

/*June*/

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class slot3
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
        Scanner sc = new Scanner(System.in);
        String s1[] = sc.nextLine().split(",");
        int ip1 =Integer.parseInt( sc.nextLine());
        int ip2 = Integer.parseInt(sc.nextLine());

for(String s: s1){
    Map<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    int max=0;
    for(Map.Entry<Character,Integer>e: map.entrySet()){

    }
}
  


}
}

	 
    
