import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        // sort(arr,arr.length);
        bubble(arr, arr.length-1, 0);

        System.out.println(Arrays.toString(arr));
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

// another way
public  static void bubble ( int arr[], int r, int c){
    if(r ==0) return;
    if(c<r){
        if(arr[c] > arr[c+1]){
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = temp;
        }
        bubble(arr, r, c+1);
    }
    bubble(arr, r-1, 0);
}
}
