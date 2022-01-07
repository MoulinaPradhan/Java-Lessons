

public class Sum {
    static int stepCount=0;
    public static void main(String[] args) {
   
    System.out.println(power(2,8));
    System.out.println("steps "+stepCount);
    System.out.println("hi");
    }
    //functional way
   public static int sum(int n){
        if(n==1) return  1;
        else return n+ sum(n-1);
    }
    
    public static int power(int a, int b){
        stepCount++;
        if(b==0) return 1;
        else return a*power(a,b-1);
    }
}

