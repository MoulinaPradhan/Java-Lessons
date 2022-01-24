public class Search2D {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(helper(arr, 7));

    }
    public static boolean helper(int arr[][],int target){
        int lo=0;int m = arr[0].length;int n = arr.length;
        int hi=(m*n)-1;

while(lo <= hi){
    int mid =(lo+hi)/2;
    if(arr[mid/m][mid%m] == target) return true;
    if(arr[mid/m][mid%m] < target){
        lo=mid+1;
    }else{
        hi=mid-1;
    }
}
return false;
    }
}

