

import java.util.*;
import java.lang.*;
import java.io.*;

class slot2
{
    static boolean check(int mid, int array[], int n, int K)
	{

		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {

			if (array[i] > mid)
				return false;

			sum += array[i];

			if (sum > mid) {
				count++;
				sum = array[i];
			}
		}
		count++;

	
		if (count <= K)
			return true;
		return false;
	}


	static int solve(int array[], int n, int K)
	{
		int start = 1;
		for (int i = 0; i < n; ++i) {
			if (array[i] > start)
				start = array[i]; 
		}
		int end = 0;

		for (int i = 0; i < n; i++) {
			end += array[i]; 
		}


		int answer = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (check(mid, array, n, K)) {
				answer = mid;
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}

		return answer;
	}

public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String arrS [] = sc.readLine().split(",");
        int arr[] = new int[arrS.length];
        for(int i=0;i<arrS.length;i++){
            arr[i] = Integer.parseInt(arrS[i]);
        }

        int k = Integer.parseInt(sc.readLine());

    
        System.out.println(solve(arr, arr.length, k));

   
        
	        
	  sc.close();      
	    } catch(Exception e) {
	  return;
	    }
	  
	   
	 
    
    }
 
}