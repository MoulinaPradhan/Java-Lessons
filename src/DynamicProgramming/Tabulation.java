

public class Tabulation {
    public static void main(String[] args) {
       int n=10;
       System.out.println(countPaths(n)); 

    }
    

public static int countPaths(int n){
    if(n==0){
        return 1;
    }
    else if(n<0){
        return 0;
    }
    int nm1 = countPaths(n-1);
    int nm2 = countPaths(n-2);
    int nm3 = countPaths(n-3);

    int cp = nm1 + nm2 + nm3;
    return cp;
}
}