import java.util.Arrays;

public class MergeSort{
 public static void main(String[] args) {
      int arr[] = {7,8,4,3,9};  
      merge(arr, 0, arr.length-1);
      System.out.println(Arrays.toString(arr));
    }
    public static void merge (int arr[] , int l, int e){
        if(l<e){
            int mid = l+(e-l)/2;
            merge(arr, l, mid);
            merge(arr, mid+1, e);
            mergeSort(arr, l,mid, e);

        }
    }
    public static void mergeSort(int arr[] , int l, int mid, int e){
        int left[] = Arrays.copyOfRange(arr, l, mid+1);
        int right[] = Arrays.copyOfRange(arr, mid+1, e+1);
        int n = left.length, m = right.length, k=l;
        int i=0, j=0;
        while(i<n && j<m){
 if(left[i] < right[j]){
    arr[k++] = left[i++];
 }else 
 arr[k++] = right[j++];
        }
        while(i<n){
            arr[k++] = left[i++];
        }
        while(j<m){
            arr[k++] = right[j++];
        }

    }
}
