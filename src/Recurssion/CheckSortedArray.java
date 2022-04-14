public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] ={1,5,2,3,4,8,90};
        System.out.println(check(0, arr));
    }
    public static boolean check(int i, int arr []){
        if(i==arr.length-1) return true;
        return arr[i] < arr[i+1] && check(i+1, arr);
    }
}
