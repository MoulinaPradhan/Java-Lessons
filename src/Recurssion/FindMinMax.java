public class FindMinMax {
    public static void main(String[] args) {
       int arr[] = {1,4,3,5,2,7};
       System.out.println(mini(arr,Integer.MAX_VALUE,0)); 
       System.out.println(maxi(arr, arr.length));
    }
    public static int mini(int arr[],int min, int i){
        if( i==  arr.length-1) return min;
        if(arr[i] < min) return mini(arr,arr[i],i+1);
        return mini(arr,min,i+1);
    }
    public static int maxi (int arr [],int  i){
    if(i == 1) return arr[0];

    return Math.max(arr[i-1], maxi(arr,arr[i-2]));

    }
}
