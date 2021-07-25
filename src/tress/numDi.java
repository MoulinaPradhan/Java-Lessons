// Java  code for better approach
// to distribute candies
 
 
class numDi
{
    // Function to find out the number of
    // candies every person received
    static void candies(int n, int k)
    {
     
        // Count number of complete turns
        int count = 0;
     
        // Get the last term
        int ind = 1;
     
        // Stores the number of candies
        int []arr=new int[k];
     
        for(int i=0;i<k;i++)
         arr[i]=0;
     
        while (n>0) {
     
            // Last term of last and
            // current series
            int f1 = (ind - 1) * k;
            int f2 = ind * k;
     
            // Sum of current and last series
            int sum1 = (f1 * (f1 + 1)) / 2;
            int sum2 = (f2 * (f2 + 1)) / 2;
     
            // Sum of current series only
            int res = sum2 - sum1;
     
            // If sum of current is less than N
            if (res <= n) {
                count++;
                n -= res;
                ind++;
            }
            else // Individually distribute
            {
                int i = 0;
     
                // First term
                int term = ((ind - 1) * k) + 1;
     
                // Distribute candies till there
                while (n > 0) {
     
                    // Candies available
                    if (term <= n) {
                        arr[i++] = term;
                        n -= term;
                        term++;
                    }
                    else // Not available
                    {
                        arr[i++] = n;
                        n = 0;
                    }
                }
            }
        }
     
        // Count the total candies
        for (int i = 0; i < k; i++)
            arr[i] += (count * (i + 1))
                    + (k * (count * (count - 1)) / 2);
     
        // Print the total candies
        for (int i = 0; i < k; i++)
            System.out.print( arr[i] + " ");
    }
     
    // Driver Code
    public static void main(String []args)
    {
        int n = 14, k = 2;
        candies(n, k);
     
         
    }
}