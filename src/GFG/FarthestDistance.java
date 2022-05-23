import java.util.Arrays;

public class FarthestDistance {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 0};
        System.out.println(Arrays.toString( farNumber(arr.length, arr)));
    }
    static int[] farNumber(int N, int arr[])
	{    
	    int ans[] = new int[N];
	    int i=0,j= arr.length-1;
	    while(i<=j){
	        if(i==j){
	            ans[i] =-1;
	            i++;
	            j=arr.length-1;
	        }
	       else if(arr[i]>arr[j]){
	            ans[i] =j;
	            i++;
	            j=arr.length-1;
	            continue;
	        }else
	        j--;
	    }
       return ans; 
	}
} 

