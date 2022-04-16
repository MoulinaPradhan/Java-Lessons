public class BinarySearchInRoatedArray {
    public static void main(String[] args) {
        int arr[] ={5, 6, 7, 8 ,9 ,10, 1, 2, 3};
        System.out.println(rbs(arr, 0, arr.length-1, 10));
        
    }
    public static int rbs(int arr[], int s, int e, int t){
        int m = s+(e-s)/2;
        if(s> e) return -1;
        if( arr[m] == t) return m;
        if(arr[s] <= arr[m]){
            if( t >= arr[s] && t<=arr[m])
            return rbs(arr, s, m-1, t);
            else
            return rbs(arr, m+1, e, t);
        }

        if(t>=arr[m] && t<= arr[e])
        return rbs(arr, m+1, e, t);
        return rbs(arr, s, m-1, t);
       
    }
}
