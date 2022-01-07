public class ReverseArray {
    public static   int arr[]= {4,3,2,1};
    public static void main(String[] args) {
      
        f(0,arr.length-1);
        f2(0);
        for(int e:arr)System.out.print(e+" ");
    }
    public static void f(int left, int right){ // parameterized with two varible
if(left >= right)return;
int temp=arr[left];
arr[left] = arr[right];
arr[right] = temp;
f(left+1,right-1);
    }

    //using only 1 varible (n-i-1) 
    public static void f2(int i){
        int n = arr.length;
        if(i>=n/2)return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        f2(i+1);
    }
}
