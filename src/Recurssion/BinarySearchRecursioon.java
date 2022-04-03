import java.util.Arrays;

public class BinarySearchRecursioon {
    public static void main(String[] args) {
        int arr[] ={12,11,3,5,89,4,5,71,36};
        Arrays.sort(arr);
        System.out.println(binarySearch(0, arr.length-1, arr, 89));

    }
    public static int binarySearch(int s, int e,int []arr, int target){
        if(s> e) return -1;
int mid = s+(e-s)/2;
if( arr[mid] == target ) 
return mid;
if(arr[mid] > target) 
return binarySearch(s, mid-1, arr, target);
return  binarySearch(mid+1, e, arr, target);
    }
}
