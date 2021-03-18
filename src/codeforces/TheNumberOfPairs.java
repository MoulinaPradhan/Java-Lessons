package src.codeforces;


import java.util.*;

public class TheNumberOfPairs {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(g(c, d, x));
        }
    }

    public static int g(int c, int d, int x){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        for(int i=1;i<=100;){
           for(int j=1;j<=100;j++){
            if(((c*lcm(i, j)) - (d*gcdn(i,j))) == x){
                current.add(i); 
                current.add(j);
            //   System.out.println(i +" "+j);
              list.add(new ArrayList<>(current));
              
             }
           
           }
           i++;
        }
        return list.size();
    }

    public static int lcm(int a, int b){
       int lcm = (a > b) ? a : b;
           while(true) {
          if( lcm % a == 0 && lcm % b == 0 ) {
            // System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
            return lcm;
          }
          ++lcm;
        }
    }

    public  static int gcdn(int a, int b){
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; ++i) {
    
         if (a % i == 0 && b % i == 0)
            gcd = i;
        }
    
      return gcd;
      }

    }

