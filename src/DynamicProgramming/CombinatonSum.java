import java.util.*;


public class CombinatonSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = (int)Math.pow(i+1,2);
            }
            System.out.println(combinationSum4(arr,n));
        
    }
    public static int combinationSum4(int[] nums, int target) {
        int[] res = new int[target + 1];
        for (int i = 1; i < res.length; i++) {
	    for (int num : nums) {
	        if (num > i)
		    break;
		else if (num == i)
		    res[i] += 1;
		else
		    res[i] += res[i-num];
	    }
	}
        return res[target];
    }
}