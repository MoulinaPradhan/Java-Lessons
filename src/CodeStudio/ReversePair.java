import java.util.Arrays;

public class ReversePair {
    public static void main(String[] args) {
        long arr[] = {1,3,2,3,1};
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
    }
    private static long mergeAndCount(long[] arr, int l,
                                     int m, int r)
    {
 
        // Left subarray
       long[] left = Arrays.copyOfRange(arr, l, m + 1);
 
        // Right subarray
       long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
 
        int i = 0, j = 0, k = l;long swaps = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
 
    // Merge sort function
    private static long mergeSortAndCount(long[] arr, int l,
                                         int r)
    {
 
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        long count = 0;
 
        if (l < r) {
            int m = (l + r) / 2;
 
            // Total inversion count = left subarray count
            // + right subarray count + merge count
 
            // Left subarray count
            count += mergeSortAndCount(arr, l, m);
 
            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);
 
            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
 
        return count;
    }
}