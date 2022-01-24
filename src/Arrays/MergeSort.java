import java.util.*;


public class MergeSort {
public static void main(String[] args) {
    
    int arr[] = {2,5,3,1,8,6};
    Sort(arr, 0, arr.length-1);
    System.out.println("Sorted arr : ");
    for(int e : arr)System.out.println(e);
}

public static void Sort(int arr[],int low,int high){
   int mid = (low+high)/2;
   
   if(low< high){
       Sort(arr, low, mid);
       Sort(arr, mid+1, high);
       merge(arr, low, mid, high);
   }

}

public static void merge(int arr[], int low, int mid, int high ){
    int left[]= Arrays.copyOfRange(arr, low, mid+1);
    int right[] = Arrays.copyOfRange(arr, mid+1, high+1);

    int i=0;int j=0;int k=low;

    while(i<left.length && j<right.length){
        if(left[i]<= right[j]){
            arr[k++] = left[i++];
        }else{
            arr[k++] = right[j++];
        }
    }
    //Copying the remaining element

    while(i<left.length){
        arr[k++] = left[i++];
    }
    while(j<right.length){
        arr[k++] = right[j++];
    }

}

}
