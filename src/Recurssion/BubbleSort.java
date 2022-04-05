public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        sort(arr,arr.length);

        for(int i: arr) System.out.print(i+" ");
    }

    public static void sort(int arr[], int n){
if(n ==1) return;
for(int i=0;i<n-1;i++){
    if(arr[i] > arr[i+1]){
        int temp = arr[i];
        arr[i]= arr[i+1];
        arr[i+1]= temp;
    }
    sort(arr, n-1);
}
    }
}
