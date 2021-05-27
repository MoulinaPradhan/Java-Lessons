import java.util.*;


public class SieveOfEratosthenes {
 
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t=sc.nextInt();
        while(t-->0){
        int L=sc.nextInt();
        int R=sc.nextInt();
            
System.out.println(calculate(L,R));
}
  
}  
 
static int array[];
static int primes[];

  public static int calculate(int n, int m) {
    int j = 0;
    int sqt = (int) Math.sqrt(m);
    array = new int[sqt + 1];
    primes = new int[sqt + 1];
    initialise(sqt + 1);
    for (int i = 2; i <= sqt; i++) {
      if (array[i] == 1) {
      primes[j] = i;
      j++;
      for (int k = i + i; k <= sqt; k += i) {
          array[k] = 0;
        }
    }
    }
    
    //printPrimesArray(j);
    int diff = (m - n + 1);
    array = new int[diff];
    initialise(diff);
    for (int k = 0; k < j; k++) {
    int div = n / primes[k];
    div *= primes[k];
    while (div <= m) {
      if(div>=n && primes[k]!=div)
      array[div-n] = 0;
      div += primes[k];
    }
    }
  List<Integer> list = new ArrayList<>();
   for (int i = 0; i < diff; i++) {
    if (array[i] == 1 && (i+n) !=1){
     list.add(i+n);
    }
 }
 if(list.size() ==0) return -1;
 int a=list.get(0);
 int b= list.get(list.size()-1);
   return b-a;
    }


   public static void initialise(int sqt) {
    for (int i = 0; i <sqt; i++) {
    array[i] = 1;
    }
    }
}
