import java.util.Arrays;
// In insertion sort we take a key and we want to find its position in sorted part of the arr

public class SelectionSort{

    // find the min index in the subarray and swap it with the curr element;
    public static void main (String args[]){
int arr[] = {5,25,3,1,78,3};
int n = arr.length;

for(int i=0;i<n;i++){
    int min = i;
   for(int j=i+1;j<n;j++){
    if(arr[j] < arr[min])
    min = j;
   }

   int temp  = arr[min];
arr[min] = arr[i];
arr[i] = temp;
}

System.out.println(Arrays.toString(arr));

    }
}
