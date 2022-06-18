public class AvaerageRoundOff {
    public static void main(String[] args) {
     int arr[] ={8,9,11,14,15};
     System.out.println(solve(arr, arr.length));   
    }
    public static int solve(int input1[], int input2){
    double sum =0;
    for(int i: input1){
        sum+=i;
    }
double x = sum/10; int y=(int)sum/10;
if(x-(double)y==0.5)return y ;
   
   
    return (int) Math.round(sum/input2);
    }
}
