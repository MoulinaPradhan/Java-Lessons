public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={28,9,3,4,6,78,9};
        System.out.println(check(arr, 0, 2));
    }
    public static boolean check (int arr[] ,int i, int t){
        if(arr[i] == t) return true;
        if(arr.length-1 == i) return arr[i] == t;
        return check(arr, i+1, t);
    }
}
