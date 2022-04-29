import java.util.Arrays;

public class LeftStrong {
    public static void main(String[] args) {
        int arr[] ={1,4,4};
      System.out.println( Arrays.toString(leftLarge(arr.length, arr)));
    
    }
    public static int[] leftLarge(int n, int[] arr) {
		int a[] = new int [n];
		a[0] =arr[0];
		int max=a[0];
		for(int i=1;i<n;i++){
			max = Math.max(max,Math.max(arr[i-1],arr[i]));
			a[i] = max;
		}
		return a;
	}

}
