import java.util.Arrays;
// In insertion sort we take a key and we want to find its position in sorted part of the arr

public class InsertionSort{
    public static void main (String args[]){
int arr[] = {5,2,3,1};
int n = arr.length;

for(int i=1;i<n;i++){
    int key = arr[i];
   int j =i-1;
   while(j>=0 && arr[j] > key){
    arr[j+1] =arr[j];
    j--;
   }
   arr[j+1] = key;
    }


System.out.println(Arrays.toString(arr));

    }
}
