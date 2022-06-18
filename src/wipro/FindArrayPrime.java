public class FindArrayPrime {
    public static void main(String[] args) {
        int arr[] ={10,41,18,50,43,31,29,25,59,96,67};
        int arr1[]={10,20,30,40};
        System.out.println(sum(arr1));
        System.out.println(sum(arr));
    }
    public static int sum (int [] arr){
int total = 0, largest=0,largestNonPrime=0;
for(int n:arr){
    total+= n;
    if(isPriime(n)){
        largest = Math.max(largest, n);
    }
    largestNonPrime=Math.max(largestNonPrime, n);
}
int grandTotal = total;
for(int n:arr){
    if(isPriime(n) && n!=largest){
        total-=n;
    } 
}
if(total==grandTotal){

    return total-largestNonPrime;
}
return grandTotal-total;

    }
    public static boolean isPriime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
