public class MultipleRecursionCall {
    public static void main(String[] args) {
    System.out.println(fib(4));    
    }
    public static int fib(int i){
        if(i==0) return 0;
        if(i ==1) return 1;
        return fib(i-1)+fib(i-2); //Multiple fn calls
    }

    // for every number we are calling two recurrsion calls
    //TC- 2^n
}
